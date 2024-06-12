package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@@어노테이션 이요앻서 constructor, getter, setter, toString
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class BlogDTO {
	private String commentName;
	private String commentOption;

}
