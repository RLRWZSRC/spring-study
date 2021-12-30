package com.wjh.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiecProxy proxy = new UserServiecProxy();
        proxy.setUserService(userService);
        proxy.log("日志");


        //反射练习
        Class aClass = Class.forName("com.wjh.demo2.Client");
        System.out.println(aClass);
        String x = aClass.toString();
        System.out.println(x.substring(6));
        Class c2 = Class.forName(x.substring(6));
        System.out.println(c2.toString().substring(20));
        System.out.println(c2.toString().substring(20).getClass());

        Person person = new Person();
        Class C3 = person.getClass();
        System.out.println(C3);
        Object superclass = C3.getSuperclass();
        System.out.println(superclass);
        Method test = C3.getMethod("test");
        System.out.println(test);
        Object o = C3.getDeclaredConstructor().newInstance("");


    }

}

class Person {
    public void test() {
        System.out.println("nananne");
    }
}
