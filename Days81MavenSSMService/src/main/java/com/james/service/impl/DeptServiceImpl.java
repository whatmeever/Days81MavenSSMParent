package com.james.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.james.dao.IDeptDao;
import com.james.pojo.Dept;
import com.james.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {
	
	@Resource
	private IDeptDao deptDao;

	@Override
	public List<Dept> getAllDept() {
		return deptDao.getAllDept();
	}

}
