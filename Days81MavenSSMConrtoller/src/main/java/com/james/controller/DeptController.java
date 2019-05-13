package com.james.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.pojo.Dept;
import com.james.service.IDeptService;

@RestController
public class DeptController {
	
	@Autowired
	private IDeptService deptService;
	
	@GetMapping("/Depts")
	public List<Dept> getAllDepts(){
		return deptService.getAllDept();
	}
}
