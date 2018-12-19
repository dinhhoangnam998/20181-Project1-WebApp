package knh.t7.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.User;
import knh.t7.service.admin.UserService;

@Controller
@RequestMapping("admin/user/")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<User> listUser = userService.getAll();
		model.addAttribute("listUser", listUser);
		return "admin/user/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("user", new User());
		return "admin/user/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("user") User user) {
		userService.save(user);
		// here need replace
		return "redirect:/admin/user/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "admin/user/edit";
	}

	@PostMapping("edit")
	public String editUser(@ModelAttribute("user") User user) {
		userService.update(user);
		return "redirect:/admin/user/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		userService.deleteById(id);
		return "redirect:/admin/user/";
	}
	
	@GetMapping("block")
	public String block(@RequestParam("id") int id, Model model) {
		User user = userService.getById(id);
		user.setState(1);
		userService.update(user);
		return "redirect:/admin/user/";
	}
	@GetMapping("unblock")
	public String unblock(@RequestParam("id") int id, Model model) {
		User user = userService.getById(id);
		user.setState(0);
		userService.update(user);
		return "redirect:/admin/user/";
	}
}
