/*
* Copyright (c) 2016 Sohu TV. All rights reserved.
*/
package com.sohu.tv.api.service;

import com.sohu.tv.api.bean.VideoInfo;

/**
 * <P>
 * Description:
 * </p>
 * @author wenbozhang
 * @version 1.0
 * @Date 2016年2月16日下午8:14:07
 */
public interface VideoService {
    VideoInfo get(long id);
}
