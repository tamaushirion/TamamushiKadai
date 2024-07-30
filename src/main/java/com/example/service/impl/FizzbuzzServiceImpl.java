package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.FModel;
import com.example.repository.FizzbuzzMapper;
import com.example.service.FizzbuzzService;

@Service
public class FizzbuzzServiceImpl implements FizzbuzzService {
	
	@Autowired
	private FizzbuzzMapper mapper;
	
	@Override
	public List<FModel> findNum() {
		return mapper.findNum();
	}
	
}
