package com.abc.s1.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("login")
	public String getLogin()throws Exception{
		return "member/memberLogin";
	}
	
	@GetMapping("join")
	public String setJoin()throws Exception{
		return "member/memberJoin";
	}
}
