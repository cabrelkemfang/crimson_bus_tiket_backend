package com.example.crimson_bus_service.Contoller;

import com.example.crimson_bus_service.Domain.Destination;
import com.example.crimson_bus_service.Domain.Transation;
import com.example.crimson_bus_service.Domain.User;
import com.example.crimson_bus_service.Repository.DestinationRepository;
import com.example.crimson_bus_service.Repository.TransationRepository;
import com.example.crimson_bus_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class Controller {
  private final DestinationRepository destinationRepository;
  private final TransationRepository transationRepository;
  private final UserRepository userRepository;

  @Autowired
  public Controller(final DestinationRepository destinationRepository,
                    final TransationRepository transationRepository,
                    final UserRepository userRepository){
    super();
    this.destinationRepository=destinationRepository;
    this.transationRepository=transationRepository;
    this.userRepository=userRepository;
  }


  //create transaction
  @RequestMapping(value = "/transaction",method = RequestMethod.GET)
  public ResponseEntity<List<Transation>> getTransaction() {
    List<Transation> transations;
    transations = transationRepository.findAll();
    return new ResponseEntity<>(transations, HttpStatus.OK);
  }

    //create transation
    @RequestMapping(value = "/transaction",method = RequestMethod.POST)
    public ResponseEntity<Transation> createTransaction(@RequestBody Transation transation ){
      Transation transation1 = this.transationRepository.save(transation);
      return  new ResponseEntity<>(transation1,HttpStatus.CREATED);
    }

  //update transation
  @RequestMapping(value = "/transaction",method = RequestMethod.PUT)
  public ResponseEntity<Transation> updateTransaction(@RequestBody Transation transation ){
    Transation transation1 = this.transationRepository.save(transation);
    return  new ResponseEntity<>(transation1,HttpStatus.CREATED);

  }

  //delete transation
  @RequestMapping(value = "/transaction/{id}",method = RequestMethod.PUT)
  public void deleteTransaction(@PathVariable("id") Long id){
    this.transationRepository.delete(id);
  }


  //get user
  @RequestMapping(value = "/user",method = RequestMethod.GET)
  public ResponseEntity<List<User>> getUser() {
    List<User> users;
    users = userRepository.findAll();
    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  //get user
  @RequestMapping(value = "/user/{user_name}/{password}",method = RequestMethod.GET)
  public Optional<User> getUser1(@PathVariable("user_name") String user_name,@PathVariable("password") String
                                                                                             password) {
    Optional<User> users;
   users = userRepository.findUser(user_name,password);
    return users;
  }

  //create user
  @RequestMapping(value = "/user",method = RequestMethod.POST)
  public ResponseEntity<User> saveeUser(@RequestBody User user) {
    User user1;
    user1 = userRepository.save(user);
    return new ResponseEntity<>(user1, HttpStatus.OK);
  }

  //Update user
  @RequestMapping(value = "/user",method = RequestMethod.PUT)
  public ResponseEntity<User> updateUser(@RequestBody User user) {
    User user1;
    user1 = userRepository.save(user);
    return new ResponseEntity<>(user1, HttpStatus.OK);
  }

  //delete user
  @RequestMapping(value = "/user/{id}",method = RequestMethod.POST)
  public void deleteUser(@PathVariable("id") Long id) {
   userRepository.delete(id);
  }

  //get destination
  @RequestMapping(value = "/destination",method = RequestMethod.GET)
  public ResponseEntity<List<Destination>> getDestination() {
    List<Destination> destinations;
    destinations = destinationRepository.findAll();
    return new ResponseEntity<>(destinations, HttpStatus.OK);
  }

  //create destination
  @RequestMapping(value = "/destination",method = RequestMethod.POST)
  public ResponseEntity<Destination> createDestination(@RequestBody Destination destination) {
    Destination destinations;
    destinations = destinationRepository.save(destination);
    return new ResponseEntity<>(destinations, HttpStatus.OK);
  }

  //update destination
  @RequestMapping(value = "/destination",method = RequestMethod.PUT)
  public ResponseEntity<Destination> updateDestination(@RequestBody Destination destination) {
    Destination destinations;
    destinations = destinationRepository.save(destination);
    return new ResponseEntity<>(destinations, HttpStatus.OK);
  }

  //delete destination
  @RequestMapping(value = "/destination/{id}",method = RequestMethod.DELETE)
  public void deleteDestination(@PathVariable("id") Long id) {
     destinationRepository.delete(id);
  }

  //get destination info
  @RequestMapping(value = "/destination/{destination_name}",method = RequestMethod.GET)
  public ResponseEntity<Destination>getDestinationinfo(@PathVariable("destination_name") String destination_name) {
    Destination destinations;
    destinations = destinationRepository.destinationInfo(destination_name);
    return new ResponseEntity<>(destinations, HttpStatus.OK);
  }
}
