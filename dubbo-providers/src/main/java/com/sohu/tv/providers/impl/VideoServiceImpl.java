/*
* Copyright (c) 2016 Sohu TV. All rights reserved.
*/
package com.sohu.tv.providers.impl;

import com.sohu.tv.api.bean.VideoInfo;
import com.sohu.tv.api.service.VideoService;
import com.sohu.tv.providers.mock.RedisVideoMock;

/**
 * <P>
 * Description:
 * </p>
 * @author wenbozhang
 * @version 1.0
 * @Date 2016年2月16日下午8:15:43
 */
public class VideoServiceImpl implements VideoService{
    private  RedisVideoMock redisVideoInfoMock;


    public void setRedisVideoInfoMock(RedisVideoMock redisVideoInfoMock) {
        this.redisVideoInfoMock = redisVideoInfoMock;
    }


    @Override
    public VideoInfo get(long id) {
        return redisVideoInfoMock.get(id);
    }

}
