package com.RestuarantAuth.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.RestuarantAuth.model.Restauregistration;

public interface Restuarantrepo extends JpaRepository<Restauregistration, Integer> {
	Restauregistration findByEmailID(String email);

}
