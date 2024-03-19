package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Merchant;
import com.app.service.MerchantService;


@Validated
@RestController
@RequestMapping("/merchants")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

   //@PostMapping("/register")
    //public ResponseEntity<Merchant> registerMerchant(@RequestBody Merchant merchant) {
     // Merchant registeredMerchant = merchantService.registerMerchant(merchant);
      //  return ResponseEntity.ok(registeredMerchant);
    //}

    @PostMapping("/register")
    public ResponseEntity<Object> registerMerchant(@RequestBody @Valid Merchant merchant, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        Merchant registeredMerchant = merchantService.registerMerchant(merchant);
        return ResponseEntity.ok(registeredMerchant);
    }
 
 
   
       
  
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        try {
            Merchant merchant = merchantService.login(email, password);
            if (merchant != null) {
                return ResponseEntity.ok("Login successful");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
  
   @GetMapping("/{id}")
   public ResponseEntity<Merchant> getMerchantById(@PathVariable Long id) {
       Merchant merchant = merchantService.getMerchantById(id);
       if (merchant == null) {
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(merchant);
   }
 
}     
  

