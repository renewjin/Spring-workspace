package com.khmall.dto;

import java.sql.Date;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int member_id;
	private String username;
	private String password;
	private String email;
	private Date created_at;
}
