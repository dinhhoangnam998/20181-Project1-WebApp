package knh.t7.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.User;

@Repository
public class UserDao {

	@Autowired
	SimpleCrudDao crudDao;
	
	public boolean authenticate(User user) {
		return true;
	}
	
	public boolean registry(User user) {
		crudDao.create(user);
		return true;
	}
	
}
