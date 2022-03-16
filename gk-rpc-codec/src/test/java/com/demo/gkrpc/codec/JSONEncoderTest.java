package com.demo.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zyl
 */
public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("zyl");
        bean.setAge(18);

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}