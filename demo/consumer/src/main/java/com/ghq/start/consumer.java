package com.ghq.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import cn.teaey.sprintboot.test.AbcService;
import io.swagger.models.Swagger;

/**
 * @author hucheng
 * @since 0.0.0
 */
@Import({
	Swagger.class
})
@SpringBootApplication
public class consumer {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(consumer.class, args);
        AbcService bean = run.getBean(AbcService.class);
        System.out.println(bean.echoService.echo("abccc"));
    }
}
