package com.abc.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** 
 * thymeleaf
 * 
 */


@Controller
public class Home {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message","thymeleaf project");
		return "index";
	}
	
}
