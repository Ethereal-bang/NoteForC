package com.user.domain;

import java.util.Date;

public class Account {
    private String id;
    private String name;
    private int money;
    private Date createTime;
    private Date updateTime;

    public Account(String id, String name, int money, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    //getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
