package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/

//员工实体类 （identity (0:经理; 1:系统管理员; 2:库存管理员; 3:售货员
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer uid;
    private String name;
    private int identity;
    private int salary;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

