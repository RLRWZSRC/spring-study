package com.wjh.demo1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于  <bean id="user" class="com.wjh.pojo.User"/>

@Component
@Scope("Singleton")
public class User {

    public String name;

    @Value("wjh")
    public void setName(String name) {
        this.name = name;
    }
}
