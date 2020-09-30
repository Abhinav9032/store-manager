package com.store.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.manage.entity.ProductEntity;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity , Long>{

	
	
}