package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.InputEvent;

public interface InputEventJpa extends JpaRepository<InputEvent, Integer>  {

}
