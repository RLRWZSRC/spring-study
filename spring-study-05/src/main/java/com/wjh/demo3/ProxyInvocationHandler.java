package com.wjh.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author RLRWZSRC
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //处理代理实例

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理，通过反射机制实现
        Object Result = method.invoke(rent, args);
        return Result;
    }
}
