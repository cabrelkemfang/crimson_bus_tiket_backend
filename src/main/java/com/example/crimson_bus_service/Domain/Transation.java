package com.example.crimson_bus_service.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transation {

  @Id
  @Column(name = "transaction_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "cni")
  private Long cni;

  @Column(name = "seat")
  private String seat;

  @Column(name = "destination")
  private String destination;

  @Column(name = "car_number")
  private String carNumber;

  @Column(name = "amount")
  private String amount;

  @Column(name = "created_on")
  private String createdOn;

  @Column(name = "departure_time")
  private String departureTime;

  @Column(name = "departure_date")
  private Date departure_date;


  public Transation(String firstName, String lastName, Long cni, String seat, String destination, String carNumber, String amount, String createdOn, String departureTime, Date departure_date) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.cni = cni;
    this.seat = seat;
    this.destination = destination;
    this.carNumber = carNumber;
    this.amount = amount;
    this.createdOn = createdOn;
    this.departureTime = departureTime;
    this.departure_date = departure_date;
  }

  public Transation() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Long getCni() {
    return cni;
  }

  public void setCni(Long cni) {
    this.cni = cni;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public Date getDeparture_date() {
    return departure_date;
  }

  public void setDeparture_date(Date departure_date) {
    this.departure_date = departure_date;
  }
}
