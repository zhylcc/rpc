package com.demo.gkrpc.server;

import com.demo.gkrpc.codec.Decoder;
import com.demo.gkrpc.codec.Encoder;
import com.demo.gkrpc.codec.JSONDecoder;
import com.demo.gkrpc.codec.JSONEncoder;
import com.demo.gkrpc.transport.HTTPTransportServer;
import com.demo.gkrpc.transport.TransportServer;
import lombok.Data;

/**
 * server配置
 *
 * @author zyl
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
