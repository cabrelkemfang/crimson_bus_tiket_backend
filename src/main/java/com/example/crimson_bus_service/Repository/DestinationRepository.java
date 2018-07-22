package com.example.crimson_bus_service.Repository;

import com.example.crimson_bus_service.Domain.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DestinationRepository extends JpaRepository<Destination,Long> {

  @Query(value = "SELECT * FROM destination WHERE destination_name  = ?1", nativeQuery = true)
  Destination destinationInfo(String destination_name);
}
