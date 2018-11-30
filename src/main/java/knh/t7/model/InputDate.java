package knh.t7.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InputDate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date inputdate;

	public InputDate() {
		super();
	}

	public InputDate(Date inputdate) {
		super();
		this.inputdate = inputdate;
	}

	public InputDate(int id, Date inputdate) {
		super();
		this.id = id;
		this.inputdate = inputdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "InputDate [id=" + id + ", inputdate=" + inputdate + "]";
	}

}
