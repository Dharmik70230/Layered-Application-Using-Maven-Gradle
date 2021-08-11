package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;
/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
public class LoginDaoimpl implements LoginDaos {

	private  static Session session;
	static {
		Configuration cfg = new  Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Database Connection established");
				
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from User");
		return query.getResultList();
	}

	@Override
	public User getUserById(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class,username);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
	}

	

}
