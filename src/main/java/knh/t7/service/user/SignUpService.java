package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;
import knh.t7.service.UserChecker;

@Service
public class SignUpService {

	@Autowired
	private UserChecker userChecker;
	
	@Autowired
	private UserJpa userJpa;
	
	public int signUp(User user) {
		int retvl = userChecker.checkSignUp(user);
		if(retvl == -1) {
			userJpa.save(user);
		}
		return retvl;
	}

}
