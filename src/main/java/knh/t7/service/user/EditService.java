package knh.t7.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;
import knh.t7.util.UserChecker;

@Service
public class EditService {

	@Autowired
	private UserJpa userJpa;
	
	@Autowired
	private UserChecker userChecker;
	
	public User getUserById(int id) {
		return userJpa.getOne(id);
	}


	public int editProfile(User user) {
		int retvl = userChecker.checkEditProfile(user);
		if(retvl == -1) {
			userJpa.save(user);
		}
		return retvl;
	}

}
