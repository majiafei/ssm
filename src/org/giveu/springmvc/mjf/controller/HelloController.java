package org.giveu.springmvc.mjf.controller;

import java.util.List;

import org.giveu.springmvc.mjf.model.User;
import org.giveu.springmvc.mjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Object hello(){
		System.out.println("=============="+System.getProperty("catalina.home"));
		return userService.findUsers();
	}

}
