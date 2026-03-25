package com.springproject.firstspring.repositories;

import com.springproject.firstspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
