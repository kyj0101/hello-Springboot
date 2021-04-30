package com.kh.springboot.menu.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springboot.menu.model.vo.Menu;

@Repository
public class MenuDaoImpl implements MenuDao {
	@Autowired
	private SqlSession session;

	@Override
	public List<Menu> selectMenuList() {
		return session.selectList("menu.selectMenuList");
	}

	@Override
	public List<Menu> selectMenuListType(String type) {
		return session.selectList("menu.selectMenuListType", type);
	}
}
