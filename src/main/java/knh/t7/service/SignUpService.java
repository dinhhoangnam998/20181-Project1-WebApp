package knh.t7.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Address;
import knh.t7.model.Phone;
import knh.t7.model.User;
import knh.t7.repository.AddressJpa;
import knh.t7.repository.PhoneJpa;
import knh.t7.repository.UserJpa;

@Service
public class SignUpService {

	@Autowired
	private UserJpa userJpa;

	@Autowired
	private AddressJpa addressJpa;

	@Autowired
	private PhoneJpa phoneJpa;

	public boolean signUp(User user, String address, String phonenumber) {
		
		// must be check here...
		if (true) {
			Address addrezz = new Address(address, user);
			Phone phone = new Phone(phonenumber, user);

			userJpa.save(user);
			addressJpa.save(addrezz);
			phoneJpa.save(phone);
			
			return true;
		}
		return false;
	}

}
