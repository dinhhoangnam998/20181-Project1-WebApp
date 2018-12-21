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

import knh.t7.model.Bill;
import knh.t7.service.admin.BillService;

@Controller
@RequestMapping("admin/bill/")
public class BillController {

	@Autowired
	private BillService billService;

	@GetMapping(value= {"", "show"})
	public String show(Model model) {
		List<Bill> listBill = billService.getAll();
		model.addAttribute("listBill", listBill);
		return "admin/bill/show";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("bill", new Bill());
		return "admin/bill/add";
	}

	@PostMapping("add")
	public String add(@ModelAttribute("bill") Bill bill) {
		billService.save(bill);
		// here need replace
		return "redirect:/admin/bill/add";
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, Model model) {
		Bill bill = billService.getById(id);
		model.addAttribute("bill", bill);
		return "admin/bill/edit";
	}

	@PostMapping("edit")
	public String editBill(@ModelAttribute("bill") Bill bill) {
		billService.update(bill);
		return "redirect:/admin/bill/";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		billService.deleteById(id);
		return "redirect:/admin/bill/";
	}
}
