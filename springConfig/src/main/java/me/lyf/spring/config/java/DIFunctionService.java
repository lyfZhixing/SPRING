package me.lyf.spring.config.java;

/**
 * @author lyf
 * @Description
 * @date 2019-02-27 10:56
 * @modified by
 */
public class DIFunctionService {

    FuctionService fuctionService;

    public void setFuctionService(FuctionService fuctionService) {
        this.fuctionService = fuctionService;
    }

    public String sayHello(String hello) {
        return fuctionService.sayHello(hello);
    }

}
