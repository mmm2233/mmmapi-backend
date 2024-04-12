package com.mmm.mmmcommon.service;

/**
 * 内部用户接口信息服务
 *

 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
