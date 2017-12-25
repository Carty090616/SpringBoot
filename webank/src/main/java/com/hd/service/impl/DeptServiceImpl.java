package com.hd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hd.dto.BaseContidionVO;
import com.hd.mapper.DeptMapper;
import com.hd.model.Dept;
import com.hd.model.Userbean;
import com.hd.service.IDeptService;
import com.hd.service.IUserService;
@Service
public class DeptServiceImpl implements IDeptService {

	@Resource
	private DeptMapper deptMapper;
	
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Dept> query(BaseContidionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> queryAll() {
	    List<Dept> list=deptMapper.queryAll();
		return list;
	}

	
}
