package com.demo.gkrpc.codec;

/**
 * εεΊεε
 *
 * @author zyl
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
