package com.srff.userauthbkes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
	
	@PostMapping("/userLogin")
	private String userLogin() {
		return "Logged In";
	}

}
