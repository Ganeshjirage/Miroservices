package com.example.user.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/list")
	public List<String> getRatingList() {
		List<String> list = new ArrayList<String>();
		list.add("Mobile");
		list.add("Laptop");
		list.add("Cahrger");
		list.add("Headphones");
		list.add("USB");
		list.add("Tablet");
		return list;
	}
}
