package com.srff.userauthbkes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {

	@PostMapping("/userRegister")
	private String userRegister() {
		return "User registered";
	}
}
