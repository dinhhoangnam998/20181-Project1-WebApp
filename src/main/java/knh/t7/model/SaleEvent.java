package knh.t7.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaleEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date begindate;
	private Date enddate;

	public SaleEvent() {
		super();
	}

	public SaleEvent(Date begindate, Date enddate) {
		super();
		this.begindate = begindate;
		this.enddate = enddate;
	}

	public SaleEvent(int id, Date begindate, Date enddate) {
		super();
		this.id = id;
		this.begindate = begindate;
		this.enddate = enddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBegindate() {
		return begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "SaleEvent [id=" + id + ", begindate=" + begindate + ", enddate=" + enddate + "]";
	}

}
