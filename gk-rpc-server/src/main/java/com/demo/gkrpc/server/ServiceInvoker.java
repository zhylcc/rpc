package com.demo.gkrpc.server;

import com.demo.gkrpc.Request;
import com.demo.gkrpc.common.utils.ReflectionUtils;

/**
 * 调用具体服务
 *
 * @author zyl
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(service.getTarget(), service.getMethod(), request.getParameters());
    }
}
