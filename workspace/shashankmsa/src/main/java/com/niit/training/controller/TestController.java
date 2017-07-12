package com.niit.training.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/MyWeb/") 
	@ResponseBody public String TestWeb(@PathParam("name") String name) {
		return "Thanks  " + name;
	}
}
