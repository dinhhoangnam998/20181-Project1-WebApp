package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.repository.UserJpa;

@Service
public class DeleteService {

	@Autowired
	private UserJpa userJpa;
	
	public void deleteUserById(int id) {
		userJpa.deleteById(id);
	}

}
