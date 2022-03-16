package com.demo.gkrpc.client;

import com.demo.gkrpc.Peer;
import com.demo.gkrpc.codec.Decoder;
import com.demo.gkrpc.codec.Encoder;
import com.demo.gkrpc.codec.JSONDecoder;
import com.demo.gkrpc.codec.JSONEncoder;
import com.demo.gkrpc.transport.HTTPTransportClient;
import com.demo.gkrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author zyl
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));
}
