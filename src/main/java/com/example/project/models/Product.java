package com.example.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String productName;
  private Double price;
  private String details;

  public Double getPrice() {
    return price;
  }

  public String getProductName() {
    return productName;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getDetails() {
    return details;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
  
  public Integer getId() {
    return id;
  }
}
