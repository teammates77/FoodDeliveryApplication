package com.Userservice.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;

@Service
public interface RegistrationService {

	List<RegistrationDTO> getAllRegistrations();

	List<RegistrationDTO> getAllUsers();

	boolean validateLogin(LoginDTO loginRequest);

	RegistrationDTO createUser(RegistrationDTO registrationDTO);

	static ResponseEntity<?> forgotPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	boolean existsByEmail(String email);


}
