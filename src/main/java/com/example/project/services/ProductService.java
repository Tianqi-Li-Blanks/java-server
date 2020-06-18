package com.example.project.services;


import com.example.project.models.Product;
import com.example.project.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
  @Autowired
  ProductRepository repository;

  List<Product> products = new ArrayList<Product>();{
  }

  public Product createProduct(Product product) {
    return repository.save(product);
  }
  public Product findProductById(Integer id) {
    return repository.findProductById(id);
  }

  public List<Product> findAllProduct() {
    return (List<Product>)repository.findAll();
  }

  public List<Product> deleteProduct(Integer pid) {
    repository.deleteById(pid);
    List<Product> result = new ArrayList<Product>();
    return result;
  }

  public Product updateProduct(Integer pid, Product updatedProduct){
    Product product = repository.findProductById(pid);
    product.setPrice(updatedProduct.getPrice());
    product.setProductName(updatedProduct.getProductName());
    product.setDetails(updatedProduct.getDetails());
    repository.save(product);
    return product;
  }

}