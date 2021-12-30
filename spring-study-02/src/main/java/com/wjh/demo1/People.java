package com.wjh.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class People {

    @Autowired
    private cat cat;
    @Autowired
    @Qualifier(value = "dog11")
    private dog dog;
    private String name;

    public com.wjh.demo1.cat getCat() {
        return cat;
    }

    public void setCat(com.wjh.demo1.cat cat) {
        this.cat = cat;
    }

    public com.wjh.demo1.dog getDog() {
        return dog;
    }

    public void setDog(com.wjh.demo1.dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
