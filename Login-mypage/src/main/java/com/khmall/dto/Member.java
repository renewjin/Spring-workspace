package com.khmall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // 나중에 문제생겻을 때 = 값이 제대로 안 넘어올때 왜 안넘어오는가! 확인하는 String
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int member_id;
	private String member_name;
	private int member_age;
	private String member_phone;
}
