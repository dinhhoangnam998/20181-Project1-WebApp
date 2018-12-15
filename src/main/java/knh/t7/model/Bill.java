package knh.t7.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Proxy(lazy = false)
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(columnDefinition = "datetime default now()")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date billdate;

	@Column(columnDefinition = "int default 0")
	private int state;

	private String note;

	@ManyToOne
	private User user = new User();

	public Bill() {
		super();
	}

	public Bill(String note, int userId) {
		this();
		this.note = note;
		this.user.setId(userId);
	}

	public Bill(Date billdate, String note, int userId) {
		this();
		this.billdate = billdate;
		this.note = note;
		this.user.setId(userId);
	}

	public Bill(String note, User user) {
		super();
		this.note = note;
		this.user = user;
	}

	public Bill(Date billdate, String note, User user) {
		super();
		this.billdate = billdate;
		this.note = note;
		this.user = user;
	}

	public Bill(int id, Date billdate, int state, String note, User user) {
		super();
		this.id = id;
		this.billdate = billdate;
		this.state = state;
		this.note = note;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBilldate() {
		return billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billdate=" + billdate + ", state=" + state + ", note=" + note + ", user=" + user
				+ "]";
	}

}
