package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Publisher;

public interface PublisherJpa extends JpaRepository<Publisher, Integer>  {

}
