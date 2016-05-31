/*
 * ©2016 Rick Qian. some rights reserved.
 */

/*
 * ©2016 Rick Qian. some rights reserved.
 */

package com.rick.qian.framework.config.enums;

/**
 * Created by Rick Qian on 16-5-6.
 */
public enum ConfLocation {
    ZK("zookeeper"),
    CACHE("缓存"),
    FS("文件系统");

    private String desc;

    ConfLocation(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}