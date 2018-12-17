package knh.t7.service;

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

	public int checkEditProfile(User user) {
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
		if (username == "") {
			System.out.println("username is empty");
			return false;
		}

		Pattern pattern = Pattern.compile("[A-Za-z0-9_]+");
		if (!pattern.matcher(username).matches()) {
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
		if (password.equals("") || confirmPasword.equals("")) {
			System.out.println("password or confirmPassword is empty");
			return false;
		}
		if (!password.equals(confirmPasword)) {
			System.out.println("password not same confirmPassword");
			return false;
		}
		return true;
	}

	public boolean checkEmail(String email) {
		if (email == "") {
			System.out.println("email is empty");
			return false;
		}

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		return pat.matcher(email).matches();
	}

	public boolean checkBirthDay(Date birthday) {
		if (birthday != null) {
			Date now = new Date();
			if (birthday.getTime() > now.getTime()) {
				System.out.println("birthday is invalid");
				return false;
			}
		}

		return true;
	}

	public boolean checkPhone(String phone) {
		if (!phone.equals("")) {
			if (phone.length() > 12 || phone.length() < 10) {
				System.out.println("phone is invalid");
				return false;
			}
		}
		return true;
	}

}
