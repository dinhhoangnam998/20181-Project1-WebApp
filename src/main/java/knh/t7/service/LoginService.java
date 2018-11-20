package knh.t7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserRepo;

@Service
public class LoginService {
	
	@Autowired
	private UserRepo userRepo;
	
	public boolean authenticate(User user) {
		return userRepo.authenticate(user); 
	}

}
