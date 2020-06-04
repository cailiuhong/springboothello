package com.bjsxt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot HelloWorld
 * @author Administrator
 *
 */
@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	public String showHelloWorld(Model model){
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "HelloWorld");
		System.out.println("hello world!");
		model.addAttribute("msg", "Thymeleaf 第一个案例");
		return "index";
	}
}
