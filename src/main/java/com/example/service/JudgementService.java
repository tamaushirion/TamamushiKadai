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
	
	public List<String> ResultJudgementService(int inputNum) {
		
		
		List<String> message = new ArrayList<String>();
		List<Integer> number = new ArrayList<Integer>();
		
		for(int i = inputNum; i <= inputNum + 100; i++) {
			
			if(fizzbuzzService.fizzbuzzJudgementService(i)) {
				
				message.add("FizzBuzz");
				number.add(i);
			} else if(fizzService.fizzJudgementService(i)) {
				
				message.add("Fizz");
				number.add(i);
			} else if(buzzService.buzzJudgementService(i)) {
				
				message.add("Buzz");
				number.add(i);
			} else {
				message.add("None");
				number.add(i);
			}
			
		}
		
		return message;
	}
	
}
