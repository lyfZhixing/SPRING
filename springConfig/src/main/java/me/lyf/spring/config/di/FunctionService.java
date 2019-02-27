package me.lyf.spring.config.di;

import org.springframework.stereotype.Service;

/**
 * @author lyf
 * @Description 依赖注入
 * @date 2019-02-27 10:05
 * @modified by
 */
@Service
public class FunctionService {
    public String sayHello(String world) {
        return "hello" + world;
    }
}
