package com.example.ex.dao;

import java.util.List;

import com.example.ex.dto.ListDto;


public interface IListDao {
	
	public List<ListDto> getList();
	
	public ListDto get(int id);
	
	void save(ListDto dto);
	
	void delete(int id);
	
}
