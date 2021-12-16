package com.pojo;

import java.util.Date;
import java.util.Properties;

public class User {



    private int id;
    private String uuid;
    private String name;
    private String pwd;
    private Date CreatDate;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", CreatDate=" + CreatDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatDate() {
        return CreatDate;
    }

    public void setCreatDate(Date creatDate) {
        CreatDate = creatDate;
    }

    public User() {
    }

    public User(int id, String uuid, String name, String pwd, Date creatDate) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.pwd = pwd;
        CreatDate = creatDate;
    }
}
