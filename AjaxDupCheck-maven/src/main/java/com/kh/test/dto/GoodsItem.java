package com.kh.test.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GoodsItem {
	private int itemId;
	private String itemName;
	private String itemDes;
	
	private Integer itemCount;
}
