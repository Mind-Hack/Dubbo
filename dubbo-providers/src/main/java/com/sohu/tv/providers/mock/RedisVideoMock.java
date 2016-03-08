/*
* Copyright (c) 2016 Sohu TV. All rights reserved.
*/
package com.sohu.tv.providers.mock;

import com.sohu.tv.api.bean.VideoInfo;

/**
 * <P>
 * Description:
 * </p>
 * @author wenbozhang
 * @version 1.0
 * @Date 2016年2月16日下午8:24:12
 */
public class RedisVideoMock {
        public  VideoInfo get(long id){
            VideoInfo videoInfo=new VideoInfo();
            videoInfo.setId(id);
            videoInfo.setInfo("Redis视频信息"+id);
            videoInfo.setName("Redis视频名字"+id);
            return videoInfo;
        }
}
