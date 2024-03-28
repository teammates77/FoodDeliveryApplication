package com.Userservice.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Userservice.DTO.ForgotPasswordRequest;
import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;
import com.Userservice.DTO.SetPasswordRequest;
import com.Userservice.Service.RegistrationService;
import com.Userservice.Service.UserService;
import com.Userservice.model.User;

import jakarta.validation.Valid;
@Validated
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v")
public class UserController {
	private final RegistrationService registrationService;
	private final ModelMapper modelMapper;
	 private UserService userService;
	
	@Autowired
	public UserController(RegistrationService registrationService, ModelMapper modelMapper, UserService userService ) {
		this.registrationService = registrationService;
		this.modelMapper = modelMapper; 
		this.userService = userService;
		
	}
@PostMapping("/register")
public ResponseEntity<?> createUser(@RequestBody RegistrationDTO registrationDTO){
    try {
        // Validate the registrationDTO
        if (registrationDTO == null || registrationDTO.getEmail() == null || registrationDTO.getPassword() == null) {
            return new ResponseEntity<>("Email or Password can't be Empty", HttpStatus.BAD_REQUEST);
        }
        
        // Check if email already exists
        if (registrationService.existsByEmail(registrationDTO.getEmail())) {
            return new ResponseEntity<>("Email ID already exists", HttpStatus.CONFLICT);
        }
        
        // Attempt to create the user
        RegistrationDTO createdRegistrationDTO = registrationService.createUser(registrationDTO);
        return new ResponseEntity<>("User Registration Successful", HttpStatus.CREATED);
    } catch (Exception e) {
        return new ResponseEntity<>("User Registration is failed: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}



@GetMapping("/registereddetails")
public ResponseEntity<List<RegistrationDTO>>getAllUsers(){
	List<RegistrationDTO> registrationDTO = registrationService.getAllUsers();
	if(registrationDTO.isEmpty()) {
		return ResponseEntity.ok(Collections.emptyList());
	}else {
	return ResponseEntity.ok(registrationDTO);
	}
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

@PutMapping("/updateProfile/{id}")
public ResponseEntity<?> updateProfile(@PathVariable int id, @Valid @RequestBody RegistrationDTO registrationDTO) {
    try {
        Optional<User> optionalUser = registrationService.getUserById(id);
        if (!optionalUser.isPresent()) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }

        User existingUser = optionalUser.get();
        existingUser.setFirstName(registrationDTO.getFirstName());
        existingUser.setLastName(registrationDTO.getLastName());
        existingUser.setPhNumber(registrationDTO.getPhNumber());
        existingUser.setEmail(registrationDTO.getEmail()); 

        User updatedUser = registrationService.updateUser(existingUser);

        RegistrationDTO updatedRegistrationDTO = modelMapper.map(updatedUser, RegistrationDTO.class);
        return new ResponseEntity<>(updatedRegistrationDTO, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>("Failed to update profile: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
/*@GetMapping("/user/{id}")
public ResponseEntity<?> getUserById(@PathVariable int id) {
    try {
        Optional<User> optionalUser = registrationService.getUserById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            RegistrationDTO registrationDTO = modelMapper.map(user, RegistrationDTO.class);
            return new ResponseEntity<>(registrationDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    } catch (Exception e) {
        return new ResponseEntity<>("Failed to retrieve user details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}*/
@GetMapping("/user/{email}")
public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
    try {
        User user = registrationService.getUserByEmail(email);
        if (user != null) {
            RegistrationDTO registrationDTO = modelMapper.map(user, RegistrationDTO.class);
            // Set the password field of the DTO to null or any other desired value
            registrationDTO.setPassword(null); // or registrationDTO.setPassword(""); if you want to set it to an empty string
            return new ResponseEntity<>(registrationDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    } catch (Exception e) {
        return new ResponseEntity<>("Failed to retrieve user details: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
@PutMapping("/forgot-password")
public ResponseEntity<String> forgotPassword(@RequestBody ForgotPasswordRequest request) {
    return new ResponseEntity<>(userService.forgotPassword(request.getEmail()), HttpStatus.OK);
}
@PutMapping("/set-password")
public ResponseEntity<String> setPassword(@RequestBody SetPasswordRequest request) {
    String email = request.getEmail();
    String newPassword = request.getNewPassword();
    String confirmPassword = request.getConfirmPassword();

    if (!newPassword.equals(confirmPassword)) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("New password and confirm password do not match");
    }

    return new ResponseEntity<>(userService.setPassword(email, newPassword), HttpStatus.OK);
}
}




	
	

