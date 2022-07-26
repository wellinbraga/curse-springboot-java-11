package com.sts.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.curse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
