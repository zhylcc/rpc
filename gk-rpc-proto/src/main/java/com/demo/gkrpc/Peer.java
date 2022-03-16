package com.demo.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 表示网络传输的一个端口
 *
 * @author zyl
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
