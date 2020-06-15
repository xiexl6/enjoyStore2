package com.enjoy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XxlServer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:dubbo.xml");
        context.start();

        System.out.println("-----dubbo开启-----");

        // 保证服务一直开着
        synchronized (XxlServer.class) {
            try {
                XxlServer.class.wait();
            } catch (Throwable e) {
            }
        }
    }
}
