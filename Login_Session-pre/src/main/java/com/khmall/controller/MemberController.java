package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khmall.dto.Member;
import com.khmall.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("m", new Member());
		return "login";
	}
	
	@PostMapping("/login")
	public String getLogin(Model model,
							@RequestParam("email") String email,
							@RequestParam("password") String password,
							HttpSession session) {
		Member member = memberService.getLogin(email, password);
		if(member != null) {
			session.setAttribute("loginSession", member);
			return "redirect:/";
		} else {
			model.addAttribute("error", "일치하는 이메일과 비밀번호가 없습니다");
			model.addAttribute("m", new Member());
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
