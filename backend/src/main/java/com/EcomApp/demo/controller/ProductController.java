package com.EcomApp.demo.controller;


import com.EcomApp.demo.model.Product;
import com.EcomApp.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service ;

    @RequestMapping("/")
    public String greet(){
        return "hi this is himanshu" ;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts() ;
    }
}
