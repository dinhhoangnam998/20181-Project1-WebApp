package knh.t7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserDao;

@Service
public class RegistryService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean registry(User user) {
		return (userDao.registry(user) == null);
	}

}
