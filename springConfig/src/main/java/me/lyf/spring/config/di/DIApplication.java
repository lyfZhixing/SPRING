package me.lyf.spring.config.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lyf
 * @Description
 * @date 2019-02-27 10:09
 * @modified by
 */
public class DIApplication {
    public static void main(String[] args) {
        // 初始化容器，并接受一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        // 获得Bean
        // DiFunctionService diFunctionService = context.getBean(DiFunctionService.class);
        DiFunctionService diFunctionService = new DiFunctionService();
        String str = diFunctionService.sayHello("Mr.树");
        System.out.println(str);
        context.close();
    }
}
