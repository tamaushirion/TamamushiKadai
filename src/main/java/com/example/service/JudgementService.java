package com.example.service;

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
	
	public String[][] ResultJudgementService(String inputNum) {
		
		int num = Integer.parseInt(inputNum);
		String[][] result = new String[100][2];
		
		for(int i = 0; i < 100; i++) {
			
			if(fizzbuzzService.fizzbuzzJudgementService(num + i)) {
				
				result[i][0] = "FizzBuzz";
				result[i][1] = String.valueOf(num + i);
			} else if(fizzService.fizzJudgementService(num + i)) {
				
				result[i][0] = "Fizz";
				result[i][1] = String.valueOf(num + i);
			} else if(buzzService.buzzJudgementService(num + i)) {
				
				result[i][0] = "Buzz";
				result[i][1] = String.valueOf(num + i);
			} else {
				
				result[i][0] = "None";
				result[i][1] = String.valueOf(num + i);
			}
			
		}
		
		return result;
	}
	
}
