package com.Userservice.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;
import com.Userservice.Service.RegistrationService;
@RestController
@RequestMapping("/api/v")
public class UserController {
	private final RegistrationService registrationService;
	
	@Autowired
	public UserController(RegistrationService registrationService) {
		this.registrationService = registrationService;
		
	}
@PostMapping("/register")
 public ResponseEntity<?> createUser(@RequestBody RegistrationDTO registrationDTO){
	try {
		RegistrationDTO createdRegistrationDTO = registrationService.createUser(registrationDTO);
		return new ResponseEntity<>("User Registration Successful", HttpStatus.CREATED);
	}catch (Exception e) {
		return new ResponseEntity<>("User Registration is failed" + e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}}

@GetMapping("/registereddetails")
public ResponseEntity<List<RegistrationDTO>>getAllUsers(){
	List<RegistrationDTO> registrationDTO = registrationService.getAllUsers();
	return new ResponseEntity<>(registrationDTO, HttpStatus.OK);
	}
	
@PostMapping("/login")
public ResponseEntity<String> login (@RequestBody LoginDTO loginRequest){
	if (loginRequest == null || loginRequest.getEmail().isEmpty() || loginRequest.getPassword().isEmpty()) {
		return new ResponseEntity<>("Email or Password can't be Empty", HttpStatus.BAD_REQUEST);
	}
	boolean isValidLogin = registrationService.validateLogin(loginRequest);
	if(isValidLogin) {
		return new ResponseEntity<>("Login Successful", HttpStatus.OK);
	}else {
		return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
	}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

