package com.springproject.firstspring.repositories;

import com.springproject.firstspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
