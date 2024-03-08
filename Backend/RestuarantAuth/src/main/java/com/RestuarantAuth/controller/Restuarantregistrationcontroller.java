package com.RestuarantAuth.controller;

import java.util.List;

import com.RestuarantAuth.service.Restuarantregistrationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/restuaregistrations")
public class Restuarantregistrationcontroller {

    private final Restuarantregistrationservice restuarantregistrationservice;

    @Autowired
    public Restuarantregistrationcontroller(Restuarantregistrationservice restuarantregistrationservice) {
        this.Restuarantregistrationservice = restuarantregistrationservice;
    }

    @PostMapping("/postdetails")
    public ResponseEntity<Restauregistration> createSellerRegistration(@RequestBody Restauregistration restauregistration) {
    	Restauregistration createdRestauregistration = restuarantregistrationservice.createSellerRegistration(restauregistration);
        return new ResponseEntity<>(createdRestauregistration, HttpStatus.CREATED);
    }

  @GetMapping("/getdetails")
  public ResponseEntity<List<Restauregistration>> getAllRestauregistrations() {
        List<Restuaregistration> restauregistration = restuarantregistrationservice.getAllrestauregistrations();
       return new ResponseEntity<>(restauregistration, HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String emailID, @RequestParam String password) {
    	 if (emailID.isEmpty() || password.isEmpty()) {
    	        return new ResponseEntity<>("EmailID or Password cannot be empty", HttpStatus.BAD_REQUEST);
    	    }

        boolean isValidLogin = restuarantregistrationservice.validateLogin(emailID, password);
        if (isValidLogin) {
            return new ResponseEntity<>("Login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
        }
    }
}

