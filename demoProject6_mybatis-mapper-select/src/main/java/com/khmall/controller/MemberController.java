package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Member;
import com.khmall.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberList")
	public String getAllMembers(Model model) {
		List<Member> mList = memberService.getAllMembers();
		model.addAttribute("memberList", mList);
		return "memberList";
	}

}
