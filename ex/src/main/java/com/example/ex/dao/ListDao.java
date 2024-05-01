package com.example.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.ex.dto.ListDto;

public class ListDao implements IListDao{
	
	Connection conn = DBcon.getConnection();
	
	@Override
	public List<ListDto> getList() {
		List<ListDto> list = new ArrayList<>();
		
		String sql = "select * from tList";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				
				ListDto dto = new ListDto(id, title, writer, content);
				
				list.add(dto);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public ListDto get(int id) {
		
		ListDto dto = new ListDto();
		
		String sql = "select * from tList where id=" + id;
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			id = rs.getInt("bno");
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			String content = rs.getString("content");
			
			dto = new ListDto(id, title, writer, content);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public void save(ListDto dto) {
		String sql = "insert into tList values (?,?,?,?)";
	
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2,dto.getTitle());
			pstmt.setString(3, dto.getWriter());
			pstmt.setString(4, dto.getContent());
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from tList where id=" + id;
		
		try {
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
