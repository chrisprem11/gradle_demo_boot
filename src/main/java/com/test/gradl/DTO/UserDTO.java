package com.test.gradl.DTO;

import com.test.gradl.model.Address;
import com.test.gradl.model.Model;

import lombok.Data;

@Data
public class UserDTO {

	private String name;
	private String contact;
	private Address address;
	private Object data;


}
