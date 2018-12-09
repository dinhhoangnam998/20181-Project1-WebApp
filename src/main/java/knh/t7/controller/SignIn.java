package knh.t7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignIn {

	@GetMapping("signin")
	public String showSignIn() {
		return "user/signin";
	}
}
