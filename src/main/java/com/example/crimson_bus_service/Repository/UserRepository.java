package com.example.crimson_bus_service.Repository;

import com.example.crimson_bus_service.Domain.Destination;
import com.example.crimson_bus_service.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

  @Query(value = "SELECT * FROM user WHERE user_name  = ?1 and password= ?2", nativeQuery = true)
  Optional<User> findUser(String user_name, String password);
}


