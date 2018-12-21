package knh.t7.service.user;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Bill;
import knh.t7.model.BillDetail;
import knh.t7.repository.BillDetailJpa;
import knh.t7.repository.BillJpa;

@Service
public class ShoppingService {

	@Autowired
	private BillJpa billJpa;

	@Autowired
	private BillDetailJpa billDetailJpa;

	public int addToCart(int userId, int bookId, int quantity) {

		Bill bill = billJpa.findByUser_IdAndState(userId, 0);

		if (bill == null) {
			Bill newBill = new Bill(new Date(), "default", userId);
			newBill = billJpa.save(newBill);
			BillDetail newBillDetail = new BillDetail(quantity, newBill.getId(), bookId, 1, 1);
			billDetailJpa.save(newBillDetail);
			return newBill.getId();
		} else {
			BillDetail checkExits = billDetailJpa.findByBill_IdAndBook_Id(bill.getId(), bookId);
			if (checkExits == null) {
				BillDetail newBillDetail = new BillDetail(quantity, bill.getId(), bookId, 1, 1);
				billDetailJpa.save(newBillDetail);
			} else {
				checkExits.setQuantity(checkExits.getQuantity() + quantity);
				billDetailJpa.save(checkExits);
			}
			return bill.getId();

		}

	}

	public List<BillDetail> getAllBillDetailByBillId(int billId) {

		return billDetailJpa.findByBill_Id(billId);
	}

	public void deleteBillDetailById(int billDetailId) {
		billDetailJpa.deleteById(billDetailId);

	}

	public int getBillIdByBillDetailId(int billDetailId) {
		
		return billDetailJpa.getOne(billDetailId).getBill().getId();
	}

	public BillDetail getBillDetailById(int billDetailId) {
		return billDetailJpa.getOne(billDetailId);
	}

	public void editCart(int billDetailId, int newQuantity) {
		BillDetail billDetail = billDetailJpa.getOne(billDetailId);
		billDetail.setQuantity(newQuantity);
		billDetailJpa.save(billDetail);
	}

	public int getBillIdByUserId(int userId) {
		Bill bill = billJpa.findByUser_IdAndState(userId, 0);
		if(bill == null) {
			return -1;
		}
		return bill.getId();
	}


}
