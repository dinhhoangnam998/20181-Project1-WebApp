package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.service.SignInService;

@Controller
public class SignInController {

	@Autowired
	private SignInService signInService;
	
	@GetMapping("showSignIn")
	public String showSignIn() {
		return "user/showSignIn";
	}

	@PostMapping("signIn")
	public String signIn(@RequestParam("username") String username, @RequestParam("password") String password) {
		if(signInService.signIn(username, password)) {
			return "index";
		}
		else
			return "error";
		
	}
}
