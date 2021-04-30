package com.kh.springboot.menu.model.dao;

import java.util.List;

import com.kh.springboot.menu.model.vo.Menu;

public interface MenuDao {

	List<Menu> selectMenuList();

	List<Menu> selectMenuListType(String type);

}
