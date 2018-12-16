package knh.t7.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.User;
import knh.t7.service.user.InfoService;

@Controller
@RequestMapping("user/")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("info")
	public String info(@RequestParam("id") int id, Model model) {
		User user = infoService.getUserById(id);
		model.addAttribute("user", user);
		return "user/info";
	}

}
