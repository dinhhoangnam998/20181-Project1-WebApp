package knh.t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import knh.t7.repository.InitDbDao;

@Controller
public class InitDb {

	@Autowired
	public InitDbDao con;
	
	@RequestMapping(value="/initDb", method=RequestMethod.GET)
	public String initDb() {
		con.constructData();
		return "redirect:login";
	}
	
}
