package com.hello.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@Value("${hello.env}")
	private String helloEnv;

	@GetMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, This is API from " + helloEnv;
	}

	@GetMapping("/item/{id}")
	@ResponseBody
	public Map<String, String> item(@PathVariable String id) {
		Map<String, String> item = new HashMap<>();
		item.put("ID", id);
		return item;
	}

}