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
@RequestMapping("admin/")
public class SaleEventController {
	@Autowired
	private SaleEventService saleEventService;

	@GetMapping(value = { "showSaleEvent", "saleEvent" })
	public String showSaleEvent(Model model) {
		List<SaleEvent> saleEventList = saleEventService.getAll();
		model.addAttribute("saleEventList", saleEventList);
		return "admin/saleEvent/showSaleEvent";
	}

	@GetMapping("showAddSaleEvent")
	public String showAddSaleEvent(Model model) {
		model.addAttribute("saleEvent", new SaleEvent());
		return "admin/saleEvent/showAddSaleEvent";
	}

	@PostMapping("addSaleEvent")
	public String addSaleEvent(@ModelAttribute("saleEvent") SaleEvent saleEvent) {
		saleEventService.save(saleEvent);
		return "redirect:/admin/showSaleEvent";
	}

	@GetMapping("showEditSaleEvent")
	public String showEditSaleEvent(@RequestParam("id") int id, Model model) {
		SaleEvent saleEvent = saleEventService.getById(id);
		model.addAttribute("saleEvent", saleEvent);
		return "admin/saleEvent/showEditSaleEvent";
	}

	@PostMapping("editSaleEvent")
	public String editSaleEvent(@ModelAttribute("saleEvent") SaleEvent saleEvent) {
		saleEventService.update(saleEvent);
		return "redirect:/admin/showSaleEvent";
	}

	@GetMapping("deleteSaleEvent")
	public String deleteSaleEvent(@RequestParam("id") int id) {
		saleEventService.deleteById(id);
		return "redirect:/admin/showSaleEvent";
	}
}
