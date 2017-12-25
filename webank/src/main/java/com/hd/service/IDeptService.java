package com.hd.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hd.dto.BaseContidionVO;
import com.hd.model.Dept;

public interface IDeptService {
    void save(Dept dept);
    void update(Dept dept);
    void delete(int id);
    Dept findById(int id);
    /**
     * 
     * @return
     */
    PageInfo<Dept> query(BaseContidionVO vo);
    List<Dept> queryAll();
}
