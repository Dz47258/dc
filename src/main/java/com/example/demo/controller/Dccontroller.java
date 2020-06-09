package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Dccontroller {
	@RequestMapping("/")
	public String dc() {
		System.out.println("我来了");
		System.out.println("0.0");
		System.out.println("嘿嘿嘿");
		return "Anan.html";
	}

}
