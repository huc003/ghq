package com.ghq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghq.service.EchoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api(value="onlinestore", description="测试文件类")
public class TestController {
	
	@Reference(version = "1.0.0")
    public EchoService echoService;
	
	
	@RequestMapping(value={"/index"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ApiOperation(value="测试api", notes="")
	public String test() {
		echoService.echo("sdsd");
		return "asdad";
		
	}
}
