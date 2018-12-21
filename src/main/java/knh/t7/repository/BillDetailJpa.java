package knh.t7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.BillDetail;

public interface BillDetailJpa extends JpaRepository<BillDetail, Integer> {

	List<BillDetail> findByBillId(int billId);

	List<BillDetail> findByBill_Id(int billId);

	BillDetail findByBill_IdAndBook_Id(int billId, int bookId);

}
