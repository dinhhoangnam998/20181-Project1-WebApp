package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Book;

public interface BookJpa extends JpaRepository<Book, Integer>  {

}
