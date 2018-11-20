package knh.t7.model;

public class User {
	
	private String username;
	private String password;
	private String name;
	private int age;
	
	public User() {
		super();
	}
	
	public User(String username, String password, String name, int age) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
