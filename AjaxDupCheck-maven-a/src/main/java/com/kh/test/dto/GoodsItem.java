package com.kh.test.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsItem {
	private int item_id;
	private String item_name;
	private String item_description;
	
	private Integer item_count;
}
