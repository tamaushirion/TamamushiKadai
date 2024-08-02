package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FizzService {

	public Boolean fizzJudgementService(int inputNum) {

		
		Boolean result = false;

		if (inputNum % 3 == 0) {
			result = true;
		}

		return result;

	}
}
