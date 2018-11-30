package knh.t7.repository;

import org.springframework.stereotype.Repository;

import knh.t7.model.User;

@Repository
public class UserDao {
	
	public boolean authenticate(User user) {
		return !user.getUsername().equals(user.getPassword());
	}
	
	public boolean registry(User user) {
		return !user.getUsername().equals(user.getPassword());
	}

}
