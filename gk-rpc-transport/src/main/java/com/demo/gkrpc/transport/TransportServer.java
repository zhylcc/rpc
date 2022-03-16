package com.demo.gkrpc.transport;

/**
 * 1、启动、监听端口
 * 2、接收请求
 * 3、关闭监听
 *
 * @author zyl
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
