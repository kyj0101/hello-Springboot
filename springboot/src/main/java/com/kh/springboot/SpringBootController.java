package com.kh.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.springboot.menu.model.service.MenuService;
import com.kh.springboot.menu.model.vo.Menu;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SpringBootController {
	
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/")
	public String home() {
		log.info("home 요청!");
		List<Menu> list = menuService.selectMenuList();
		log.info("menulist = {}",list);
		
		return "forward:/index.jsp";
	}
}
