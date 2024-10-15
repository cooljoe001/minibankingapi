package com.example.miniBank.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private double amount;
    private String type;
    private LocalDateTime timestamp;



    @ManyToOne
    @JoinColumn (name ="user_id")
    private User user;


    // GETTERS AND SETTERS


          public Long getId() {
              return id;
          }

          public void setId(Long id) {
              this.id = id;
          }

          public double getAmount() {
              return amount;
          }

          public void setAmount(double amount) {
              this.amount = amount;
          }

          public String getType() {
              return type;
          }

          public void setType(String type) {
              this.type = type;
          }

          public LocalDateTime getTimestamp() {
              return timestamp;
          }

          public void setTimestamp(LocalDateTime timestamp) {
              this.timestamp = timestamp;
          }

          public User getUser() {
              return user;
          }

          public void setUser(User user) {
              this.user = user;
          }

          //

}
