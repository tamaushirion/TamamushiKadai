package com.example.service;

import java.util.List;

import com.example.model.FModel;

public interface ItemService {

	public List<FModel> findNum();
	
	public void insertNum(FModel number);
}
