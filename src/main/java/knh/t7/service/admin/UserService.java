package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;

@Service
public class UserService {

	@Autowired
	private UserJpa userJpa;
	
	public List<User> getAll() {
		
		return userJpa.findAll();
	}

	public void save(User user) {
		userJpa.save(user);
		
	}

	public User getById(int id) {
		return userJpa.getOne(id);
	}

	public void update(User user) {
		userJpa.save(user);
		
	}

	public void deleteById(int id) {
		userJpa.deleteById(id);
	}

}
