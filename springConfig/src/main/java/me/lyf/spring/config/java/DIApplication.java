package me.lyf.spring.config.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lyf
 * @Description 入口
 * @date 2019-02-27 11:02
 * @modified by
 */
public class DIApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        DIFunctionService diFunctionService = context.getBean(DIFunctionService.class);
        String str = diFunctionService.sayHello("Mr.树");
        System.out.println(str);
        context.close();
    }
}
