package knh.t7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phonenumber;

	@ManyToOne
	private User user;

	public Phone() {
		super();
	}

	public Phone(String phonenumber, User user) {
		super();
		this.phonenumber = phonenumber;
		this.user = user;
	}

	public Phone(int id, String phonenumber, User user) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phonenumber=" + phonenumber + ", user=" + user + "]";
	}

}
