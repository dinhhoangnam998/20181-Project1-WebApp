package knh.t7.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.Address;
import knh.t7.model.Phone;
import knh.t7.model.User;
import knh.t7.service.SignUpService;

@Controller
public class SignUp {

	@Autowired
	private SignUpService signUpService;

	@GetMapping("showsignup")
	public String showSignUp() {
		return "user/showsignup";
	}

	@PostMapping("singup")
	public String signUp(@RequestParam String username, @RequestParam String password, @RequestParam String confirmpassword, @RequestParam String email,
			@RequestParam String fullname, @RequestParam int gender, @RequestParam Date birthday,
			@RequestParam String address, @RequestParam String phonenumber) {

		if(signUpService.signUp(username, password, confirmpassword, email, fullname, gender, birthday, address, phonenumber)) {

			return "redirect:showsignin";
		}
		else 
			return "redirect:showsignup";
			
			

	}
}
