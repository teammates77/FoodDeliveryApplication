package com.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.auth.dto.AuthRequest;
import com.auth.dto.Customer;
import com.auth.entity.User;
import com.auth.service.JwtService;
import com.auth.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CustomerService service;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/addUser")
    public String addNewUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/allCustomers")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Customer> getAllTheCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/{customerId}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Customer getCustomerById(@PathVariable int customerId) {
        return service.getCustomer(customerId);
    }
    



    @PostMapping("/authenticate")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }


    }
}
