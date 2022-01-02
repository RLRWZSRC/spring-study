package com.wjh.demo4;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void updata() {
        System.out.println("updata");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
