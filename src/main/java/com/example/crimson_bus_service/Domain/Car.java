package com.example.crimson_bus_service.Domain;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

  @Id
  @Column(name = "car_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "car_number")
  private String carNumber;

  @Column(name = "car_driver")
  private  String carDriver;

  public Car(Long id, String carNumber, String carDriver) {
    this.id = id;
    this.carNumber = carNumber;
    this.carDriver = carDriver;
  }

  public Car() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }

  public String getCarDriver() {
    return carDriver;
  }

  public void setCarDriver(String carDriver) {
    this.carDriver = carDriver;
  }
}
