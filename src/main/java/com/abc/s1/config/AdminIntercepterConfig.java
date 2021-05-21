package com.abc.s1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.abc.s1.interceptor.AdminInterceptor;

public class AdminIntercepterConfig implements WebMvcConfigurer{
	@Autowired
	private AdminInterceptor adminInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(adminInterceptor)
				.addPathPatterns("/notice/insert")
				.addPathPatterns("/notice/update")
				.addPathPatterns("/notice/delete");
	}
}
