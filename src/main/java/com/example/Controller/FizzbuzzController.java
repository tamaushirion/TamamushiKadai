package com.example.Controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.Form;
import com.example.model.FModel;
import com.example.service.BuzzService;
import com.example.service.FizzService;
import com.example.service.FizzbuzzService;
import com.example.service.ItemService;

@Controller
public class FizzbuzzController {
	
	@Autowired
	private ItemService service;
	
	@Autowired
	private FizzbuzzService fizzbuzzService;
	
	@Autowired
	private FizzService fizzService;
	
	@Autowired
	private BuzzService buzzService;
	
	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/Fizzbuzz")
	public String getFizzbuzz(Model model, @ModelAttribute Form form) {
		
		List<FModel> numedList = service.findNum();
		
		model.addAttribute("numedList", numedList);
		
		return "/html/form";
	}
	
	
	@PostMapping("/html/form")
	public String postFizzbuzz(Model model, @ModelAttribute Form form) {
		
		FModel number = modelMapper.map(form, FModel.class);
		
		Integer a = number.getNum();
		
		String message = "";
		
		if(a < 1 && a > 100) {
			message = "1~100で入力してください";
			return "rediarect:/html/form";
		}
		
		if(!fizzbuzzService.fizzbuzzService(a)) {
			
			message = "FizzBuzz";
					
		} else if(!fizzService.fizzService(a)) {
			
			message = "Fizz";
			
		} else if(!buzzService.buzzService(a)) {
			
			message = "Buzz";
			
		} else {
			message = "NotFizzBuzz";
		}
		
		form = modelMapper.map(message, Form.class);
		
		model.addAttribute("form", form);
		
		return "/html/form";
		
	}
}
