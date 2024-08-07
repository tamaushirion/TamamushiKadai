package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class BuzzService {

	public  Boolean buzzJudgementService(int inputNum) {

		
		Boolean result = false;

		if (inputNum % 5 == 0) {
			result = true;
		}

		return result;

	}
}
