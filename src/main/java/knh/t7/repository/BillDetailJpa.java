package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.BillDetail;

public interface BillDetailJpa extends JpaRepository<BillDetail, Integer>  {

}
