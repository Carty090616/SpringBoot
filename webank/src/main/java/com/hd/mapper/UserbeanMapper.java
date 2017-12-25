package com.hd.mapper;

import java.util.List;

import com.hd.dto.BaseContidionVO;
import com.hd.model.Userbean;

public interface UserbeanMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Userbean record);

    int insertSelective(Userbean record);

    Userbean selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Userbean record);

    int updateByPrimaryKey(Userbean record);

	List<Userbean> query(BaseContidionVO vo);
}