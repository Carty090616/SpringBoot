package com.hd.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hd.dto.BaseContidionVO;
import com.hd.model.Userbean;

public interface IUserService {
    void save(Userbean user);
    void update(Userbean user);
    void delete(int id);
    Userbean findById(int id);
    /**
     * 
     * @return
     */
    PageInfo<Userbean> query(BaseContidionVO vo);
}
