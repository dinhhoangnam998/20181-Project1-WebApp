package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Category;

public interface CategoryJpa  extends JpaRepository<Category, Integer> {

}
