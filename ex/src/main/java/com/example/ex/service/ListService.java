package com.example.ex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ex.dto.ListDto;

@Service
public class ListService {

    public List<ListDto> getList() {
        List<ListDto> list = new ArrayList<>();

        return list;
    }

    public ListDto get(int id) {
        ListDto dto = new ListDto();

        return dto;
    }

    public void save(ListDto dto) {

    }

    public void delete(int id) {

    }

}
