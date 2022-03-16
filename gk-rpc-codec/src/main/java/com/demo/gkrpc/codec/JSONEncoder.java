package com.demo.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author zyl
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
