package knh.t7.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Proxy(lazy = false)
public class SaleEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date begindate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
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
