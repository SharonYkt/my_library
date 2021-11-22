package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.LoginForm;


@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();

		if ("admin".equals(username) && "admin".equals(password)) {
			return "index";
		}

		if ("user1".equals(username) && "userpwd".equals(password)) {
			return "index";
		}

		model.addAttribute("Invalid Credentials", true);
		return "login";

	}
	 
}
