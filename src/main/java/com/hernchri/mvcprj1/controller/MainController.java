package com.hernchri.mvcprj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/bootstraptesting")
	public String btest(){
		return "bootstrap";
	}
}
