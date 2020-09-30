package com.store.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.manage.entity.CarouselEntity;

@Repository
public interface CarouselRepository extends JpaRepository<CarouselEntity , Long>{

}
