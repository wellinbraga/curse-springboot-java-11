package com.sts.curse.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.sts.curse.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

}
