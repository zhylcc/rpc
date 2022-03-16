package com.demo.gkrpc;

import lombok.Data;

/**
 * 表示PRC的一个请求
 * @author zyl
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
