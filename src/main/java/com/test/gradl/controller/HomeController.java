package com.test.gradl.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.gradl.DTO.Model;
import com.test.gradl.DTO.ModelImpl;
import com.test.gradl.DTO.UserDTO;
import com.test.gradl.model.Address;
import com.test.gradl.model.User;
import com.test.gradl.service.DataService;

import net.minidev.json.JSONObject;

@RestController
public class HomeController {

	@Autowired
	private DataService dataService;

	@GetMapping("/")
	public ResponseEntity<String> getHome() {
		return new ResponseEntity<String>("Gradle Demo", HttpStatus.OK);
	}

	@GetMapping("/user/dto")
	public ResponseEntity<UserDTO> testUserDTO() {
		Address address = new Address("5th Cross", "7th Main", "560004");
		JSONObject jb = new JSONObject();
		jb.put("key", "value");
		User user = new User("John Doe", "9692", address,jb);
		UserDTO userDTO = dataService.createUserDTO(user);
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}

	@GetMapping("/dto/user")
	public ResponseEntity<User> testUser() {
		Address address = new Address("5th Cross", "7th Main", "560004");
		Model modelImpl = new ModelImpl("ModelName", "ModelNumber#200");
		User user = new User("John Doe", "9692", address,modelImpl);
		UserDTO userDTO = dataService.createUserDTO(user);
		User mappedUser = new ModelMapper().map(userDTO, User.class);
		return new ResponseEntity<User>(mappedUser, HttpStatus.OK);
	}
}
