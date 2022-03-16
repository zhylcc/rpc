package com.demo.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 *
 * @author zyl
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
