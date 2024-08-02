package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberJudgementService {
	
	public List<Integer> NumberService(int inputNum) {
		
		List<Integer> number = new ArrayList<Integer>();
		for(int i = inputNum; i <= inputNum + 100; i++) {
			number.add(i);
		}
		
		return number;
		
	}
}
	

