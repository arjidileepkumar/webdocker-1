package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {
	
	@ResponseBody
	@RequestMapping("User")
	public String  init () {
		
		return "this is my first spring boot app";
		
	}

}
