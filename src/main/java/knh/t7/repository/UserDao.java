package knh.t7.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.User;

@Repository
public class UserDao {

	@Autowired
	SimpleCrudDao crudDao;
	
	@Autowired
	SessionFactory factory;
	
	
	// authenticate
	public User authenticate(User user) {
		Session session = factory.openSession();
		Transaction tx = null;
		User userRet = new User();
		try {
			tx = session.beginTransaction();
			String queryString = "from User where username = :username and password = :password";
			Query createQuery = session.createQuery(queryString);
			createQuery.setParameter("username", user.getUsername());
			createQuery.setParameter("password", user.getPassword());
			userRet = (User) createQuery.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return userRet;
	}
	
	
	// registry
	public User registry(User user) {
		Session session = factory.openSession();
		Transaction tx = null;
		User userRet = new User();
		try {
			tx = session.beginTransaction();
			String queryString = "from User where username = :username";
			Query createQuery = session.createQuery(queryString);
			createQuery.setParameter("username", user.getUsername());
			userRet = (User) createQuery.uniqueResult();
			if( userRet == null)
				session.save(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return userRet;
	}
	
}
