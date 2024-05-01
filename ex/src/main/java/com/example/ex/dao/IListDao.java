package com.example.ex.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ex.dto.ListDto;

@Service
public interface IListDao {
	
	public List<ListDto> getList();
	
	public ListDto get(int id);
	
	void save(ListDto dto);
	
	void delete(int id);
	
}
