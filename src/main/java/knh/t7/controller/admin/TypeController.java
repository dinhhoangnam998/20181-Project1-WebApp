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

import knh.t7.model.Type;
import knh.t7.service.admin.TypeService;

@Controller
@RequestMapping("admin/type/")
public class TypeController {

	@Autowired
	private TypeService typeService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Type> listType = typeService.getAll();
		model.addAttribute("listType", listType);
		return "admin/type/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("type", new Type());
		return "admin/type/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("type") Type type) {
		typeService.save(type);
		return "redirect:/admin/type/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Type type = typeService.getById(id);
		model.addAttribute("type", type);
		return "admin/type/edit";
	}

	@PostMapping("edit")
	public String editType(@ModelAttribute("type") Type type) {
		typeService.update(type);
		return "redirect:/admin/type/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		typeService.deleteById(id);
		return "redirect:/admin/type/";
	}
}
