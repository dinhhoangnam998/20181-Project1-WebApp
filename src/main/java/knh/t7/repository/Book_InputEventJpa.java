package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Book_InputEvent;

public interface Book_InputEventJpa  extends JpaRepository< Book_InputEvent, Integer> {

}
