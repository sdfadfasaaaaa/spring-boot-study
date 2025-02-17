package com.example.entity;

import lombok.Data;

/**
 * @author chenye
 * @date 2018/11/18
 */
@Data
public class SysUser {
    private int id;
    private String loginName;
    private String name;
    private String password;

    public SysUser() {
    }
    public SysUser(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public SysUser(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
