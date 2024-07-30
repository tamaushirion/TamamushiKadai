package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class BuzzService {

	public  Boolean buzzService(int a) {

		int b = a + 100;
		Boolean result = true;

		if (b % 5 == 0) {
			result = false;
		}

		return result;

	}
}
