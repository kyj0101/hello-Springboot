package com.kh.springboot.menu.model.service;

import java.util.List;

import com.kh.springboot.menu.model.vo.Menu;

public interface MenuService {

	List<Menu> selectMenuList();

	List<Menu> selectMenuListType(String type);

}
