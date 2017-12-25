package com.hd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hd.dto.BaseContidionVO;
import com.hd.mapper.UserbeanMapper;
import com.hd.model.Userbean;
import com.hd.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserbeanMapper userMapper;
	
	@Override
	public void save(Userbean user) {
		userMapper.insertSelective(user);
	}

	@Override
	public void update(Userbean user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Userbean findById(int id) {
		// TODO Auto-generated method stub
		Userbean user=userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public PageInfo<Userbean> query(BaseContidionVO vo) {
		PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
		List<Userbean> list=userMapper.query(vo);
		PageInfo<Userbean> pageInfo=new PageInfo<>(list); 
		return pageInfo;
	}

}
