package me.lyf.spring.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lyf
 * @Description Java配置注入bean
 * @date 2019-02-27 10:58
 * @modified by
 */
@Configuration
public class DIConfig {
    @Bean
    public FuctionService functionService() {
        return new FuctionService();
    }

    // @Bean
    // public DIFunctionService diFunctionService() {
    //     DIFunctionService diFunctionService = new DIFunctionService();
    //     diFunctionService.setFuctionService(functionService());
    //     return diFunctionService;
    // }

    /**
     * @description 直接将FuctionService 作为参数给DIFunctionService，与上边的注入方法不能共存，会报错：NoUniqueBeanDefinitionException
     * @author lyf
     * @date 2019/2/27 11:10
     * @return me.lyf.spring.config.java.DIFunctionService
     */
    @Bean
    public DIFunctionService diFunctionService2(FuctionService fuctionService) {
        DIFunctionService diFunctionService = new DIFunctionService();
        diFunctionService.setFuctionService(fuctionService);
        return diFunctionService;
    }

}
