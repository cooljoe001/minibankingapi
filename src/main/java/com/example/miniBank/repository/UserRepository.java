package com.example.miniBank.repository;

 import com.example.miniBank.model.User;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
// Customizing  my query method to find a user by username

    User findByUsername(String username);


}
