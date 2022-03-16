package com.demo.gkrpc.codec;

/**
 * 反序列化
 *
 * @author zyl
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
