package com.example.crimson_bus_service.Repository;

import com.example.crimson_bus_service.Domain.Transation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransationRepository extends JpaRepository<Transation,Long> {
}
