package com.demo.gkrpc.example;

import com.demo.gkrpc.server.RpcServer;

/**
 * @author zyl
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
