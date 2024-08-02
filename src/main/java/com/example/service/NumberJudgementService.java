package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberJudgementService {
	
	public List<String> NumberService(String inputNum) {
		
		int num = Integer.parseInt(inputNum);
		
		List<String> number = new ArrayList<String>();
		for(int i = num; i <= num + 100; i++) {
			
			number.add(String.valueOf(i));
		}
		
		return number;
		
	}
}
	

