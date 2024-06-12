package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//toString getter setter noArgs AllArgs
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CafeDTO {
	private String cafeCommentName;
	private String cafeCommentOpinion;
}
