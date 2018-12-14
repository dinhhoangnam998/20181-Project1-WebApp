package knh.t7.controller.admin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.Type;
import knh.t7.service.admin.TypeService;

@Controller
@RequestMapping("admin/")
public class TypeController {

	@Autowired
	private TypeService typeService;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder) {
	  DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
	  CustomDateEditor customDate = new CustomDateEditor(dateFormat, true);
	  binder.registerCustomEditor(Date.class, customDate);
	}

	@GetMapping(value = { "showType", "type" })
	public String showType(Model model) {
		List<Type> typeList = typeService.getAll();
		model.addAttribute("typeList", typeList);
		return "admin/type/showType";
	}

	@GetMapping("showAddType")
	public String showAddType(Model model) {
		model.addAttribute("type", new Type());
		return "admin/type/showAddType";
	}

	@PostMapping("addType")
	public String addType(@ModelAttribute("type") Type type) {
		typeService.save(type);
		return "redirect:/admin/showType";
	}

	@GetMapping("showEditType")
	public String showEditType(@RequestParam("id") int id, Model model) {
		Type type = typeService.getById(id);
		model.addAttribute("type", type);
		return "admin/type/showEditType";
	}

	@PostMapping("editType")
	public String editType(@ModelAttribute("type") Type type) {
		typeService.update(type);
		return "redirect:/admin/showType";
	}

	@GetMapping("deleteType")
	public String deleteType(@RequestParam("id") int id) {
		typeService.deleteById(id);
		return "redirect:/admin/showType";
	}
}
