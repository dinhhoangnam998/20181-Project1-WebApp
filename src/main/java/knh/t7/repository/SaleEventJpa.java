package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.SaleEvent;

public interface SaleEventJpa extends JpaRepository<SaleEvent, Integer>  {

}
