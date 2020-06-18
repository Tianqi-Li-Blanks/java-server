package com.example.project.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;
  private String email;
  private String birthday;
  private String type;

  @OneToMany(mappedBy="user")
  private List<Review> reviews;

  // many to many in SQL
  // users = {u1, u2, u3}
  // enrollments = {(u1, s1, 'A', 5), (u2, s1, 'A-', 4), (u2, s3), (u3, s3)}
  // sections = {s1, s2, s3}

  @ManyToMany
  @JoinTable(
          name="enrollments",
          joinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"),
          inverseJoinColumns=@JoinColumn(name="SECTION_ID", referencedColumnName="ID"))

  private List<Section> sections;

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public List<Section> getSections() {
    return sections;
  }

  public void setSections(List<Section> sections) {
    this.sections = sections;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
