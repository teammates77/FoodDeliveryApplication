package com.Userservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;
import com.Userservice.model.User;

@Service
public interface RegistrationService {

	List<RegistrationDTO> getAllRegistrations();

	List<RegistrationDTO> getAllUsers();

	boolean validateLogin(LoginDTO loginRequest);

	RegistrationDTO createUser(RegistrationDTO registrationDTO);

	static ResponseEntity<?> forgotPassword(String email, String password) {
		return null;
	}

	boolean existsByEmail(String email);

	Optional<User> getUserById(int id);

	User updateUser(User user);

	User getUserByEmail(String email);


}
