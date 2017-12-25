package com.hd.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.hd.dto.BaseContidionVO;
import com.hd.model.Dept;
import com.hd.model.Userbean;
import com.hd.service.IDeptService;
import com.hd.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	@Resource
	private IDeptService deptService;

	// 查询用户列表
	@RequestMapping("/query")
	public String query(Model model, BaseContidionVO vo) {

		PageInfo<Userbean> list = userService.query(vo);
		model.addAttribute("pageModel", list);
		model.addAttribute("vo", vo);
		return "user/userlist";
	}

	// 到增加页面
	@RequestMapping("/init")
	public String init(Model model, Userbean user) {
        //1)找出所有的部门信息
		List<Dept> deptlist=deptService.queryAll();
		model.addAttribute("deptlist", deptlist);
		return "user/user";
	}
	
	// 到修改页面
		@RequestMapping("/updatePage/{id}")
		public String updatePage(@PathVariable("id")int id, Model model) {
	        //1）根据主键id找到用户信息
			Userbean user=userService.findById(id);
			model.addAttribute("user", user);
			//2)找出所有的部门信息
			List<Dept> deptlist=deptService.queryAll();
			model.addAttribute("deptlist", deptlist);
			return "user/user";
		}

	// 保存用户
	@RequestMapping("/save")
	public String save(Userbean user) {
       if(user.getUserid()!=null && user.getUserid()>0){
    	   userService.update(user);
       }else{
		   userService.save(user);
       }
		return "redirect:/user/query";
	}

	// 删除用户
		@RequestMapping("/delete/{id}")
		public String delete(@PathVariable("id") int id) {
	         userService.delete(id);
			return "redirect:/user/query";
		}
}
