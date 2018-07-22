package com.example.crimson_bus_service.Domain;

import javax.persistence.*;

@Entity
@Table(name = "departure_time")
public class Departure_Time {

  @Id
  @Column(name = "depature_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "time")
  private String time;

  public Departure_Time(Long id, String time) {
    this.id = id;
    this.time = time;
  }

  public Departure_Time() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
