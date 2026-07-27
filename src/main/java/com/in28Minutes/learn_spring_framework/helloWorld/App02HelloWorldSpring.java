package com.in28Minutes.learn_spring_framework.helloWorld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        try(var context =
                    new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){


            // 2: Configure the things that we want Spring to manage
            // HelloWorldConfiguration-- @Configuration
            // name - @Bean

            //Retrieve beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameter"));
            System.out.println(context.getBean("address2"));
        }



    }
}
