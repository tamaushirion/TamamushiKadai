package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class Form {

	@NotBlank
	@Pattern(regexp = "^[1-9]|[1-9][0-9]|100+$")
	private String num;
	
	private String message;
}
