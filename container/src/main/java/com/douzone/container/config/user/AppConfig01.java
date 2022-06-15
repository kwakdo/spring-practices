package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.user.User;

@Configuration
public class AppConfig01 {
	
	@Bean
	public User user() {
		User user = new User();
		user.setNo(1L);
		user.setName("둘리");
		return user;
	}
}
