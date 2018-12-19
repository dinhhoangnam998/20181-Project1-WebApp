package knh.t7.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

	@GetMapping
	public String admin(Model model, HttpServletRequest request) {
		
		Boolean isAdmin = (Boolean)request.getSession().getAttribute("isAdmin");
		if(isAdmin == null) {
			return "redirect:/user/signIn";
		}
		else {
			return "redirect:/admin/author/";
		}
		
		
	}
}
