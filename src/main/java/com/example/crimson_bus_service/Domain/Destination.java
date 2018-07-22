package com.example.crimson_bus_service.Domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "destination")
public class Destination {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "destination_id")
  private Long id;

  @Column(name = "destination_name")
  private String destinationName;

  @Column(name = "anount")
  private Long amount;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(name = "car_destination", joinColumns = @JoinColumn(name = "destination_id"), inverseJoinColumns = @JoinColumn(name = "car_id"))
  private Set<Car> cars;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(name = "destination_departure", joinColumns = @JoinColumn(name = "destination_id"), inverseJoinColumns = @JoinColumn(name = "departure_id"))
  private Set<Departure_Time> departure_times;

  public Destination(String destinationName, Long amount, Set<Car> cars, Set<Departure_Time> departure_times) {
    this.destinationName = destinationName;
    this.amount = amount;
    this.cars = cars;
    this.departure_times = departure_times;
  }

  public Destination() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Set<Car> getCars() {
    return cars;
  }

  public void setCars(Set<Car> cars) {
    this.cars = cars;
  }

  public Set<Departure_Time> getDeparture_times() {
    return departure_times;
  }

  public void setDeparture_times(Set<Departure_Time> departure_times) {
    this.departure_times = departure_times;
  }
}
