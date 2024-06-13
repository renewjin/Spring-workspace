package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("param") // ParameterController 밑에는 모두 자동으로 맨 앞에 param 붙음
@Slf4j
public class ParameterController {

	@GetMapping("mainmain")
	public String paramMain() {
		return "param/param-main"; // 폴더 param 안에 있는 param-main.html 파일 바라보기
		// return 할 때 폴더명/파일명 작성
		// param-main.html 템플릿 밑에 파람이라는 폴더 밑에 존재
		// html 파일을 바라볼 때 기본으로 templates 이라는 폴더를 바라보고
		// templates/param/param-main.html 파일을 바라본다는 표시를 작성
	}
	
	@PostMapping("test1")
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName");
		String inputAddress = req.getParameter("inputAddress");
		int inputAge = Integer.parseInt(req.getParameter("inputAge")); //-> String 에서 int로 형변환
		
		log.info("로그 입력이름 : " + inputName);
		log.info("로그 입력주소 : " + inputAddress);
		log.info("로그 입력나이 : " + inputAge);
		return "redirect:/param/param-main"; // 작성 다 되면 메인으로 돌아가기
	}
}
