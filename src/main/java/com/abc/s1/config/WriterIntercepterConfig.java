package com.abc.s1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.abc.s1.interceptor.WriterInterceptor;

public class WriterIntercepterConfig implements WebMvcConfigurer{
	@Autowired
	private WriterInterceptor writerInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(writerInterceptor)
				.addPathPatterns("/qna/update");
	}
}
