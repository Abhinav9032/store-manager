package com.store.manage.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.manage.dto.ProductsDTO;
import com.store.manage.entity.ProductEntity;
import com.store.manage.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository productsRepository;

	public ProductEntity saveProductDetails(ProductsDTO products, String imageUrl) {
		System.out.println(products);
		System.out.println(imageUrl);
		ProductEntity productsPersisted = new ProductEntity(products, imageUrl);
		System.out.println(productsPersisted);
		return productsRepository.save(productsPersisted);
	}

	public ArrayList<ProductEntity> findAll() {
		return (ArrayList<ProductEntity>) productsRepository.findAll();
	}
	
	

}
