package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Bill;

public interface BillJpa extends JpaRepository<Bill, Integer>  {

}
