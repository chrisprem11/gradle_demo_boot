package com.test.gradl.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelImpl implements Model{

	private String modelName;
	private String modelNumber;
}
