/*
* Copyright (c) 2016 Sohu TV. All rights reserved.
*/
package com.sohu.tv.api.bean;

import java.io.Serializable;

/**
 * <P>
 * Description:
 * </p>
 * @author wenbozhang
 * @version 1.0
 * @Date 2016年2月16日下午8:11:26
 */
public class VideoInfo implements Serializable{
    private long id;
    private String name;
    private String info;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    @Override
    public String toString() {
        return "VideoInfo [id=" + id + ", name=" + name + ", info=" + info + "]";
    }
}
