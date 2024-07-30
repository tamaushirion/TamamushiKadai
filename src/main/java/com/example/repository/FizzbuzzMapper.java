package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.FModel;

@Mapper
public interface FizzbuzzMapper {
	
	/* 過去数値3件取得 */
	public List<FModel> findNum();
}
