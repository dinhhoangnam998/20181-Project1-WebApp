package knh.t7.repository;

import knh.t7.model.User;

public class UserDao extends SimpleCrudDao {

	public boolean authenticate(User user) {
		return true;
	}
	
	public boolean registry(User user) {
		return true;
	}
	
}
