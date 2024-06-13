package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("member")
@Slf4j
public class MemberController {

	@GetMapping("memberInfo")
	public String memberInfo(Model model) {
		
		MemberDTO mem = new MemberDTO();
		mem.setMemberName("황진수");
		mem.setMemberPhone("010-0000-0000");
		mem.setMemberAge(10);
		model.addAttribute("mem", mem);
		
		List<MemberDTO> memList = new ArrayList<>();
		memList.add(new MemberDTO("홍길동", "010-1111-1111", 10));
		memList.add(new MemberDTO("강영의", "010-2222-2222", 20));
		memList.add(new MemberDTO("박철수", "010-3333-3333", 30));
		model.addAttribute("memList", memList);
		
		log.info("들어왔는지 확인");
		log.debug("문제없는지 확인");
		
		return "member/memberInfo";
	}
}
