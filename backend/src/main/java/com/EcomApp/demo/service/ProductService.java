package com.EcomApp.demo.service;


import com.EcomApp.demo.model.Product;
import com.EcomApp.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepo repo ;

    public List<Product> getAllProducts() {
        return repo.findAll() ;
    }
}
