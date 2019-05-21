package com.test.gradl.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.test.gradl.DTO.UserDTO;
import com.test.gradl.model.User;

@Service
public class DataService {

	public UserDTO createUserDTO(User user) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(user, UserDTO.class);
	}

	public User createUser(UserDTO userDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userDTO, User.class);
	}
}
