package com.wjh.demo3;

/**
 * @author RLRWZSRC
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }

}
