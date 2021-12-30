package com.wjh.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于  <bean id="user" class="com.wjh.pojo.User"/>

public class User {

    private String name;

    @Value("wjh")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
