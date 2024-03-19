package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Merchant;
import com.app.repository.MerchantRepository;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant registerMerchant(Merchant merchant) {
       
        if (merchantRepository.findByEmail(merchant.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }
       
        return merchantRepository.save(merchant);
    }

    //@Override
    //public Merchant login(String email, String password) {
       // Merchant merchant = merchantRepository.findByEmail(email);
        //if (merchant != null && merchant.getPassword().equals(password)) {
           // return merchant;
        //}
        //return null; // Authentication failed
    //}
    
    @Override
    public Merchant login(String email, String password) {
        Merchant merchant = merchantRepository.findByEmail(email);
        if (merchant != null && merchant.getPassword().equals(password)) {
            return merchant;
        }
        throw new RuntimeException("Invalid credentials");
    }
     
    
    @Override
    public Merchant getMerchantById(Long id) {
        return merchantRepository.findById(id).orElse(null);
    }
    

	
}
