package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;

@Service
public class SignInService {
	
	@Autowired
	private UserJpa userJpa;

	public boolean checkSignIn(String username, String password) {
		
		User user = userJpa.findByUsername(username);
		if(user == null) {
			return false;
		}
		
		return (user.getPassword().equals(password));
	}


	public int getUserIdByUsername(String username) {
		return userJpa.findByUsername(username).getId();
	}

}
