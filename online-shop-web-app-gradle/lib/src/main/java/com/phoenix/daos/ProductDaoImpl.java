package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.Product;
/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
public class ProductDaoImpl implements ProductDao {

	private  static Session session;
	static {
		Configuration cfg = new  Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Database Connection established");
				
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from Product");
		return query.getResultList() ;
	}

	@Override
	public Product getUserById(int id) {
		// TODO Auto-generated method stub
		return session.get(Product.class,id);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.delete(product);
		tx.commit();
	}

	
}
