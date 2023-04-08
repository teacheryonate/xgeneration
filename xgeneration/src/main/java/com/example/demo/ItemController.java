package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ItemController {
	
	@Value("${hello.msg}")
	private String msg;
	
	@GetMapping("")
	public String say() {
		return "안녕하세요, "+msg;
	}

}
