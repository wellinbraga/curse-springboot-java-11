package com.sts.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
