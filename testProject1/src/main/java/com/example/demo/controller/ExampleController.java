package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//어노테이션 컨트롤러
@Controller
public class ExampleController {
	
	/*
	 * @RequestMapping을 쓰면 기본으로 return할 때 html 파일을 바라보겠다
	 * 설정이 들어있음
	 * 
	 * 
	 * classpath :  src/main/resource
	 * 기본경로에 앞에 붙여진 /templates/ 폴더가 html을 담는 공간
	 * 파일명 마지막에는 항상 .html이 붙는다
	 */
	//  src/main/resource/templates/test.html로 이동하겠다라는 표시
	
	//어노테이션 겟 매핑 붙인다음 "example" 주소 사용하기
	@GetMapping("example")
	public String 이그잼플메서드() {
		//이그잼플 html 파일로 돌아가기 작성
		return "example";
	}

}
