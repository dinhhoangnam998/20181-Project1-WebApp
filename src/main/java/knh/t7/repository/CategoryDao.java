package knh.t7.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao extends SimpleCrudDao  {

	@Autowired
	public SessionFactory factory;
}
