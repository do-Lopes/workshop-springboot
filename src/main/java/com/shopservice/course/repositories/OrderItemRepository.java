package com.shopservice.course.repositories;

import com.shopservice.course.entities.Order;
import com.shopservice.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
