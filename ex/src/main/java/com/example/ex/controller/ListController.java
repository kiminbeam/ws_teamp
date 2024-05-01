package com.example.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ex.dto.ListDto;
import com.example.ex.service.ListService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class ListController {

	@Autowired
	ListService service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/list")
	public @ResponseBody String list(Model model){
		List<ListDto> list = service.getList();
		model.addAttribute("list",list);
		return "list";
	}

	@RequestMapping("/detail")
	public @ResponseBody String detail(HttpServletRequest req, Model model){
		String id_ = req.getParameter("id");
		int id = Integer.parseInt(id_);
		ListDto dto = service.get(id);
		model.addAttribute("dto", dto);
		
		return "detail";
	}

	@RequestMapping("/writeForm")
	public String writeForm() {
        return "writeForm";
    }

	@RequestMapping("/write")
	public String write(ListDto dto) {
        service.save(dto);
        return "redirect:list";
    }

	@RequestMapping("/delete")
    public String delete(int id) {
        service.delete(id);
        return "redirect:list";
    }

}
