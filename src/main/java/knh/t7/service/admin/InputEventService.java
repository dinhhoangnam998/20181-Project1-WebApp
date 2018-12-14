package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.InputEvent;
import knh.t7.repository.InputEventJpa;

@Service
public class InputEventService {
	@Autowired
	private InputEventJpa inputEventJpa;

	public List<InputEvent> getAll() {
		return inputEventJpa.findAll();
	}

	public InputEvent getById(int id) {
		return inputEventJpa.getOne(id);
	}

	public void update(InputEvent inputEvent) {
		inputEventJpa.save(inputEvent);
	}

	public void deleteById(int id) {
		inputEventJpa.deleteById(id);
	}

	public void save(InputEvent inputEvent) {
		inputEventJpa.save(inputEvent);

	}
}
