package com.demo.gkrpc.codec;

/**
 * 序列化
 *
 * @author zyl
 */
public interface Encoder {
    byte[] encode(Object obj);
}
