package com.auth.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth.dto.Customer;
import com.auth.entity.User;
import com.auth.repository.UserInfoRepository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class CustomerService {

    List<Customer> customerList = null;

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @PostConstruct
//    public void loadProductsFromDB() {
//        productList = IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> Product.builder()
//                        .productId(i)
//                        .name("product " + i)
//                        .qty(new Random().nextInt(10))
//                        .price(new Random().nextInt(5000)).build()
//                ).collect(Collectors.toList());
//    }


    public List<Customer> getCustomers() {
        return customerList;
    }

    public Customer getCustomer(int id) {
        return customerList.stream()
                .filter(product -> product.getCustomerId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("customer " + id + " not found"));
    }


    public String addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
        return "customer added to system ";
    }
}
