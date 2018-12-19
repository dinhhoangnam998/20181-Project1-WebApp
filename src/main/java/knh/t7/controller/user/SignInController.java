package knh.t7.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.User;
import knh.t7.service.user.SignInService;

@Controller
@RequestMapping("user/")
public class SignInController {

	@Autowired
	private SignInService signInService;

	@GetMapping("signIn")
	public String showSignIn(Model model) {
		return "/user/signIn";
	}

	@PostMapping("signIn")
	public String signIn(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpServletRequest request) {
		if (signInService.checkSignIn(username, password)) {
			User user = signInService.getUserByUsername(username);
			int userId = user.getId();
			request.getSession().setAttribute("userId", userId);
			request.getSession().setAttribute("isSignIn", true);

			if (user.getState() == 2) {
				request.getSession().setAttribute("isAdmin", true);
				return "redirect:/admin/author/show";
			} 

			return "redirect:/";
		} else {
			request.getSession().setAttribute("isSignIn", false);
			return "redirect:/user/signInFailure";
		}

	}

	@GetMapping("signInFailure")
	public String signInFailure(Model model) {
		return "/user/signInFailure";
	}
}
