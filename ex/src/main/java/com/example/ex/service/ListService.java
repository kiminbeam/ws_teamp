package com.example.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex.dao.IListDao;
import com.example.ex.dto.ListDto;

@Service
public class ListService {

    @Autowired
    private IListDao dao;

    public List<ListDto> getList() {
        List<ListDto> list = dao.getList();
        return list;
    }

    public ListDto get(int id) {
        ListDto dto = dao.get(id);

        return dto;
    }

    public void save(ListDto dto) {
        dao.save(dto);

    }

    public void delete(int id) {
        dao.delete(id);
    }

}
