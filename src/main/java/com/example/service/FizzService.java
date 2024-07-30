package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FizzService {

	public Boolean fizzService(int a) {

		int b = a + 100;
		Boolean result = true;

		if (b % 3 == 0) {
			result = false;
		}

		return result;

	}
}
