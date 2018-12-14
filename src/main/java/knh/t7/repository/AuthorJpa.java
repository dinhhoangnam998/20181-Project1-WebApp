package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Author;


public interface AuthorJpa extends JpaRepository<Author, Integer>  {

}
