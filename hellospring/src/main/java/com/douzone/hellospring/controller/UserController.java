package com.douzone.hellospring.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @RequestMapping url + request method 매핑 
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(
			String name, 
			String email, 
			String password, 
			String gender) 
			throws UnsupportedEncodingException {
		System.out.println("name" + ":" + name + "  " + "email" + ":" + email +  "  " + "password" + ":" + password +  "  " + "gender" + ":" + gender );
		return "redirect:/";
	}

}
