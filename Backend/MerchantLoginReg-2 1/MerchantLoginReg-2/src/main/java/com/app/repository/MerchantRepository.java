package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
    Merchant findByEmail(String email);
}
