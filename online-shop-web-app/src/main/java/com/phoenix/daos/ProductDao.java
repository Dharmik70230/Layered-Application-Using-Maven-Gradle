package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.Product;
/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
public interface ProductDao {
	

	List<Product> getAll() ; 
	Product getUserById(int id) ;
	void insert(Product product) ;
	void update(Product product) ;
	void delete(Product product) ;

}
