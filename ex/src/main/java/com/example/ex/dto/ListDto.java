package com.example.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ListDto {
	private int id;
	private String title;
	private String writer;
	private String content;
}
