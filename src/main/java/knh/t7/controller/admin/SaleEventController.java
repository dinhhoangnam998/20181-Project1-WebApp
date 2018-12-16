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

import knh.t7.model.SaleEvent;
import knh.t7.service.admin.SaleEventService;

@Controller
@RequestMapping("admin/saleEvent/")
public class SaleEventController {

	@Autowired
	private SaleEventService saleEventService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<SaleEvent> listSaleEvent = saleEventService.getAll();
		model.addAttribute("listSaleEvent", listSaleEvent);
		return "admin/saleEvent/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("saleEvent", new SaleEvent());
		return "admin/saleEvent/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("saleEvent") SaleEvent saleEvent) {
		saleEventService.save(saleEvent);
		return "redirect:/admin/saleEvent/";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		SaleEvent saleEvent = saleEventService.getById(id);
		model.addAttribute("saleEvent", saleEvent);
		return "admin/saleEvent/edit";
	}

	@PostMapping("edit")
	public String editSaleEvent(@ModelAttribute("saleEvent") SaleEvent saleEvent) {
		saleEventService.update(saleEvent);
		return "redirect:/admin/saleEvent/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		saleEventService.deleteById(id);
		return "redirect:/admin/saleEvent/";
	}
}
