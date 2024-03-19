package com.app.service;

import com.app.entity.Merchant;

public interface MerchantService {
	Merchant registerMerchant(Merchant merchant);
    Merchant login(String email, String password);
    
    Merchant getMerchantById(Long id);
	
}
