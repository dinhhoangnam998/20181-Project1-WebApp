package knh.t7.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaleDate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date saledate;

	public SaleDate() {
		super();
	}

	public SaleDate(Date saledate) {
		super();
		this.saledate = saledate;
	}

	public SaleDate(int id, Date saledate) {
		super();
		this.id = id;
		this.saledate = saledate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSaledate() {
		return saledate;
	}

	public void setSaledate(Date saledate) {
		this.saledate = saledate;
	}

	@Override
	public String toString() {
		return "SaleDate [id=" + id + ", saledate=" + saledate + "]";
	}

}
