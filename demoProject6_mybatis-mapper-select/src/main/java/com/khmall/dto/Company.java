package com.khmall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Company {

	private int company_id;
	private String company_name;
	private String company_address;
	private String company_phone;
	// 핸드폰번호는 앞에가 0으로 시작하기 때문에 String으로 해줌
	// int는 맨 앞에 붙은 0을 자동으로 없애주기 때문
}
