package knh.t7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserDao;

@Service
public class LoginService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean authenticate(User user) {
		return (userDao.authenticate(user) != null); 
	}

}
