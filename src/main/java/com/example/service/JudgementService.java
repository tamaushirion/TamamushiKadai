package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JudgementService {
	
	@Autowired
	private FizzbuzzService fizzbuzzService;
	
	@Autowired
	private FizzService fizzService;
	
	@Autowired
	private BuzzService buzzService;
	
	public List<String> ResultJudgementService(String inputNum) {
		
		int num = Integer.parseInt(inputNum);
		
		List<String> message = new ArrayList<String>();
		
		for(int i = num; i <= num + 100; i++) {
			
			if(fizzbuzzService.fizzbuzzJudgementService(i)) {
				
				message.add("FizzBuzz");
			} else if(fizzService.fizzJudgementService(i)) {
				
				message.add("Fizz");
				
			} else if(buzzService.buzzJudgementService(i)) {
				
				message.add("Buzz");
				
			} else {
				message.add("None");
				
			}
			
		}
		
		return message;
	}
	
}
