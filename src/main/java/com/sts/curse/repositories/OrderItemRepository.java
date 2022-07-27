package com.sts.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
