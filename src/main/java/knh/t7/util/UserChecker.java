package knh.t7.util;

import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import knh.t7.model.User;
import knh.t7.repository.UserJpa;

@Component
public class UserChecker {

	@Autowired
	private UserJpa userJpa;

	public int checkSignUp(User user) {

		if (!checkUsername(user.getUsername())) {
			return 1;
		}

		if (!checkPassword(user.getPassword(), user.getConfirmpassword())) {
			return 2;
		}

		if (!checkEmail(user.getEmail())) {
			return 3;
		}

		if (!checkBirthDay(user.getBirthday())) {
			return 4;
		}

		if (!checkPhone(user.getPhone())) {
			return 5;
		}

		return -1;
	}

	public boolean checkUsername(String username) {

		Pattern pattern = Pattern.compile("[A-Za-z0-9_]+");
		if(!((username != null) && pattern.matcher(username).matches())) {
			System.out.println("username must not have special character");
			return false;
		}
		
		User user = userJpa.findByUsername(username);
		if (user != null) {
			System.out.println("username already exits");
			return false;
		}

		return true;
	}

	public boolean checkPassword(String password, String confirmPasword) {
		if (!password.equals(confirmPasword)) {
			return false;
		}
		return true;
	}

	public boolean checkEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public boolean checkBirthDay(Date birthday) {
		Date now = new Date();
		if (birthday.getTime() > now.getTime()) {
			return false;
		}
		return true;
	}

	public boolean checkPhone(String phone) {
		if (phone.length() > 12 || phone.length() < 10) {
			return false;
		}
		return true;
	}

}
