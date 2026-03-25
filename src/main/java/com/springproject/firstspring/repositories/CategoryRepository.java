package com.springproject.firstspring.repositories;


import com.springproject.firstspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
