package knh.t7.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import knh.t7.model.BillDetail;
import knh.t7.model.Book;
import knh.t7.service.user.ShoppingService;

@Controller
@RequestMapping("user/")
public class ShoppingController {

	@Autowired
	private ShoppingService shoppingService;

	@GetMapping("order")
	public String order(@RequestParam("bookId") int bookId, @RequestParam("quantity") int quantity, Model model,
			HttpServletRequest request) {
		Boolean isSignIn = (Boolean) request.getSession().getAttribute("isSignIn");
		if (isSignIn == null) {
			return "redirect:/user/signIn";
		} else {
			int userId = (Integer) request.getSession().getAttribute("userId");
			int billId = shoppingService.addToCart(userId, bookId, quantity);
			return "redirect:/user/cart";
		}
	}

	@GetMapping("cart")
	public String cart(Model model, HttpServletRequest request) {

		Boolean isSignIn = (Boolean) request.getSession().getAttribute("isSignIn");
		if (isSignIn == null) {
			return "redirect:/user/signIn";
		} else {
			int userId = (Integer) request.getSession().getAttribute("userId");
			int billId = shoppingService.getBillIdByUserId(userId);
			if(billId == -1) {
				return "redirect:/user/emptyCart";
			}
			List<BillDetail> listBillDetail = shoppingService.getAllBillDetailByBillId(billId);
			model.addAttribute("listBillDetail", listBillDetail);
			model.addAttribute("billId", billId);
			return "user/cart";
		}

	}
	
	@GetMapping("emptyCart")
	public String emptyCart(Model model) {
		return "user/emptyCart";
	}

	@GetMapping("/order/edit")
	public String edit(@RequestParam("id") int billDetailId, Model model) {
		BillDetail billDetail = shoppingService.getBillDetailById(billDetailId);
		Book book = billDetail.getBook();
		model.addAttribute("quantity", billDetail.getQuantity());
		model.addAttribute("billDetailId", billDetail.getId());
		model.addAttribute("book", book);
		return "user/editcart";
	}

	@PostMapping("/order/edit")
	public String edit(@RequestParam("billDetailId") int billDetailId, @RequestParam("newQuantity") int newQuantity,
			Model model) {
		shoppingService.editCart(billDetailId, newQuantity);
		int billId = shoppingService.getBillIdByBillDetailId(billDetailId);
		return "redirect:/user/cart?id=" + billId;
	}

	@GetMapping("/order/delete")
	public String delete(@RequestParam("id") int billDetailId, Model model) {
		int billId = shoppingService.getBillIdByBillDetailId(billDetailId);
		shoppingService.deleteBillDetailById(billDetailId);
		return "redirect:/user/cart?id=" + billId;
	}

}
