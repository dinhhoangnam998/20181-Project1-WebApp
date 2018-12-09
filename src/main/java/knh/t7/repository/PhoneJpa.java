package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Phone;

public interface PhoneJpa extends JpaRepository<Phone, Integer>  {

}
