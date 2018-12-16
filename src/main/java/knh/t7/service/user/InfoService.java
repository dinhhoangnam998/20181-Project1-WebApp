package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;

@Service
public class InfoService {

	@Autowired
	private UserJpa userJpa;
	public User getUserById(int id) {
		return userJpa.getOne(id);
	}

}
