package com.smart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		User user=new User();
		user.setName("karan");
		user.setEmail("krnkur4@gmail.com");
		
		userRepository.save(user);
		return "Working";
	}
	

}
