package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.form.Form;

@Controller
public class FizzbuzzController {

	@GetMapping("/Fizzbuzz")
	public String getFizzbuzz(Form form) {
		
		
		
		return "/html/form";
	}
}
