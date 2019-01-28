package com.redisdemo.model;

import java.io.Serializable;

public class SysUser implements Serializable {

    private static final long serialVersionUID = -984024428398514502L;

    private Long userId;

    private String userName;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
