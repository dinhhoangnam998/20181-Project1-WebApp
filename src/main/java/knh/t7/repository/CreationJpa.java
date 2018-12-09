package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Creation;

public interface CreationJpa  extends JpaRepository<Creation, Integer> {

}
