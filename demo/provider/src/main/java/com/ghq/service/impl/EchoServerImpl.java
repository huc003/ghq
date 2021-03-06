package com.ghq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghq.service.EchoService;

/**
 * @author hucheng
 * @since 0.0.0
 */
@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str);
        return str;
    }
}
