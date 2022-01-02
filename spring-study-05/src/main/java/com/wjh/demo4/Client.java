package com.wjh.demo4;

import java.lang.annotation.Target;

/**
 * @author RLRWZSRC
 */
public class Client {
    public static void main(String[] args) {

        //需要代理的角色
        UserServiceImpl service = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理对像
        pih.setTarget(service);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        //调用代理类方法
        proxy.add();
    }
}
