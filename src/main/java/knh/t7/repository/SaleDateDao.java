package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Book;
import knh.t7.model.Book_SaleDate;
import knh.t7.model.SaleDate;

@Repository
public class SaleDateDao  extends SimpleCrudDao {
	@Autowired
	public SessionFactory factory;
	
	
}
