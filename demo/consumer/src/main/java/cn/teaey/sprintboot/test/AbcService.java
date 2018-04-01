package cn.teaey.sprintboot.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghq.service.EchoService;

import org.springframework.stereotype.Component;

/**
 * @author hucheng
 * @since 0.0.0
 */
@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
