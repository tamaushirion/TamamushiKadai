package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzService {

	public  Boolean fizzbuzzJudgementService(int inputNum) {

		
		Boolean result = false;
		
		if (inputNum % 5 == 0 && inputNum % 3 == 0) {
			result = true;
		}

		return result;

	}
}
