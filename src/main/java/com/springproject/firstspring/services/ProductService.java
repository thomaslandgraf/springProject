package com.springproject.firstspring.services;

import com.springproject.firstspring.entities.Product;
import com.springproject.firstspring.entities.User;
import com.springproject.firstspring.repositories.ProductRepository;
import com.springproject.firstspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
