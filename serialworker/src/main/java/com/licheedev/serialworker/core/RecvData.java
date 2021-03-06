package com.licheedev.serialworker.core;

/**
 * 表示接收到的数据
 */
public interface RecvData {

    /**
     * 接收数据的时间
     *
     * @return
     */
    long getRecvTime();

    /**
     * 完整数据包
     *
     * @return
     */
    byte[] getAllPack();
}
