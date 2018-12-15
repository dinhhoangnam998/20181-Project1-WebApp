package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.repository.UserJpa;

@Service
public class SignInService {
	
	@Autowired
	private UserJpa userJpa;

	public boolean checkSignIn(String username, String password) {
		return (userJpa.findByUsernameAndPassword(username, password) != null);
	}

}
