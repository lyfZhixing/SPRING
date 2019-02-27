package me.lyf.spring.config.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyf
 * @Description 注入
 * @date 2019-02-27 10:07
 * @modified by
 */
@Service
public class DiFunctionService {
    @Autowired FunctionService functionService;
    public String sayHello(String world) {
        return functionService.sayHello(world);
    }
}
