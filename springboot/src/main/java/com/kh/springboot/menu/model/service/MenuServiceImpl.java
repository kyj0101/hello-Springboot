package com.kh.springboot.menu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springboot.menu.model.dao.MenuDao;
import com.kh.springboot.menu.model.vo.Menu;

@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<Menu> selectMenuList() {
		return menuDao.selectMenuList();
	}

	@Override
	public List<Menu> selectMenuListType(String type) {
		return menuDao.selectMenuListType(type);
	}
}
