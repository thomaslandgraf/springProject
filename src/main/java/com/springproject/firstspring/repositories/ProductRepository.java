package com.springproject.firstspring.repositories;

import com.springproject.firstspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
