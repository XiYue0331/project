package com.example.demo.entity;


//import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//员工实体类 （identity (0:经理; 1:系统管理员; 2:库存管理员; 3:售货员
@Entity
public class Login {
    @Id
    @GeneratedValue
    private Integer uid;
    private String passwd;
    private int identity;


    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}

