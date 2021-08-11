package com.phoenix.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import com.phoenix.daos.ProductDao;			
import com.phoenix.daos.ProductDaoImpl;	
import com.phoenix.data.Product;		
import com.phoenix.exceptions.ProductNotFoundException;
import com.phoenix.exceptions.ServiceException;
/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 1.0
* Copyright : Sterlite Technologies
* 
* */
public  class ProductServiceImpl implements ProductService {

	
	private ProductDao productDao;
 	
	public ProductServiceImpl() {
		
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		
		return productDao.getAll();
	}

	
	@Override
	public   Product findProductById(int id) throws ProductNotFoundException {
		Product product =  productDao.getUserById(id);
		if(product != null)
			return product;
		else
			throw new ProductNotFoundException("Product No Found");
	}

	@Override
	public void add(Product product) throws ServiceException {
		productDao.insert(product);
	}

	@Override
	public void edit(Product product) throws ServiceException {
		productDao.update(product);
	}

	@Override
	public void remove(Product product) throws ServiceException {
		productDao.delete(product);
	}

	@Override
	public List<Product> findByName(String name) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productbyName = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getName()== name) {
				productbyName.add(product);
			}
		}
		return productbyName;
	}

	@Override
	public List<Product> findByBrand(String brand) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productbyBrand = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getBrand()== brand) {
				productbyBrand.add(product);
			}
		}
		return productbyBrand;
	}

	@Override
	public List<Product> findByPrice(float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productbyPrice = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getPrice() == price) {
				productbyPrice.add(product);
			}
		}
		return productbyPrice;
	}

	@Override
	public List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productBetweenPrice = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
				productBetweenPrice.add(product);
			}
		}
		return productBetweenPrice;
	}

	@Override
	public List<Product> findByNameAndBrand(String name, String brand) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productNameBrand = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getName() == name && product.getBrand() == brand) {
				productNameBrand.add(product);
			}
		}
		return productNameBrand;
	}

	@Override
	public List<Product> findByNameAndPrice(String name, float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productNamePrice = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getName() == name && product.getPrice() == price) {
				productNamePrice.add(product);
			}
		}
		return productNamePrice;
	}

	@Override
	public List<Product> findByBrandAndPrice(String brand, float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productBrandPrice = new ArrayList<Product>();
		for(Product product : dbProducts) {
			if(product.getPrice() == price && product.getPrice() == price) {
				productBrandPrice.add(product);
			}
		}
		return productBrandPrice;
	}

	@Override
	public List<Product> sortByName() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> sortName = new ArrayList<Product>();
		dbProducts.stream()
					.sorted(Comparator.comparing(Product::getName))
					.forEach(System.out::println);

		return sortName;
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> sortBrand = new ArrayList<Product>();
		dbProducts.stream()
					.sorted(Comparator.comparing(Product::getBrand))
					.forEach(System.out::println);

		return sortBrand;
	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> sortPrice = new ArrayList<Product>();
		dbProducts.stream()
					.sorted(Comparator.comparing(Product::getPrice))
					.forEach(System.out::println);
		return sortPrice;
	}

	@Override
	public List<Product> sortByPriceDesc() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> sortPricedesc = new ArrayList<Product>();
		dbProducts.stream()
					.sorted(Comparator.comparing(Product::getPrice).reversed())
					.forEach(System.out::println);

		return sortPricedesc;
	}

	@Override
	public Product findUserById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

}
