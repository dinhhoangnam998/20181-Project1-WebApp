package knh.t7.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InputDateDao extends SimpleCrudDao  {

	@Autowired
	public SessionFactory factory;
}
