package com.demo.gkrpc.server;

import com.demo.gkrpc.Request;
import com.demo.gkrpc.ServiceDescriptor;
import com.demo.gkrpc.common.utils.ReflectionUtils;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 管理rpc暴露的服务
 *
 * @author zyl
 */
@Slf4j
public class ServiceManager {
   private Map<ServiceDescriptor, ServiceInstance> services;

   public ServiceManager() {
       this.services = new ConcurrentHashMap<>();
   }

   public <T> void register(Class<T> interfaceClass, T bean) {
       Method[] methods = ReflectionUtils.getPublicMethods(interfaceClass);
       for (Method method : methods) {
           ServiceInstance sis = new ServiceInstance(bean, method);
           ServiceDescriptor sdp = ServiceDescriptor.from(interfaceClass, method);

           services.put(sdp, sis);
           log.info("register service: {} {}", sdp.getClazz(), sdp.getMethod());
       }
   }

   public ServiceInstance lookup(Request request) {
       ServiceDescriptor sdp = request.getService();
       return services.get(sdp);
   }
}
