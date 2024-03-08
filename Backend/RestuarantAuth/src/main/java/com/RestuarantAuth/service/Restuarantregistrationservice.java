package com.RestuarantAuth.service;
import com.RestuarantAuth.model.Restauregistration;
import com.RestuarantAuth.repository.Restuarantrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Restuarantregistrationservice {
	private final Restuarantrepo restuarantrepo;
	
@Autowired
	public Restuarantregistrationservice(Restuarantrepo restuarantrepo) {
		this.restuarantrepo = restuarantrepo;
	}

	public Restauregistration createRestuaregistration(Restauregistration restuaregistration) {
		return restuarantrepo.save(restuaregistration);
	}

	public List<Restauregistration> getAllSellerRegistrations() {
		return restuarantrepo.findAll();
	}
	public boolean validateLogin(String emailID, String password) {
		Restauregistration restuarant = restuarantrepo.findByEmailID(emailID);
	    return restuarant != null && restuarant.getPassword().equals(password);
	}



}