package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzService {

	public String fizzbuzzService(int a) {
		
		int b = a + 100;
		String result = "";
		
		if(a < 1 || a > 100) {
			result = "1~100で入力してください";
		}
		
		if(b % 5 == 0 && b % 3 == 0) {
			result = "fizzbuzz";
		} else if(b % 5 == 0) {
			result = "fizz";
		} else if(b % 3 == 0) {
			result = "buzz";
		} else {
			result = "当てはまらないです";
		}
		
		return result;
		
	}
	
	public String InputData;
}

