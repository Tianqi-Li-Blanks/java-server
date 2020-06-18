package com.example.project.repositories;

import com.example.project.models.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository
        extends CrudRepository<Product, Integer>
{
  @Query("SELECT product FROM Product product WHERE product.id=:pid")
  public Product findProductById(@Param("pid") Integer userId);

}