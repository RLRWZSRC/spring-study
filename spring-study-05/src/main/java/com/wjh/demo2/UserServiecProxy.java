package com.wjh.demo2;

public class UserServiecProxy implements UserService {

    private UserServiceImpl userService;

    public UserServiecProxy(UserServiceImpl userService) {
    }

    public UserServiecProxy() {

    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.add();
    }

    @Override
    public void updata() {
        userService.add();
    }

    @Override
    public void query() {
        userService.add();
    }

    //日志
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
