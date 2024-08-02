package com.example.form;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class Form {

	@NotNull
	@Range(min=1, max=100)
	@Digits(integer = 3, fraction = 1)
	private Integer num;
	
	private String message;
}
