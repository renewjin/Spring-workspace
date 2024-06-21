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
public class Clothes {
	private int clothes_id;
    private String clothes_name;
    private int clothes_price;
    private String clothes_category;
    private String clothes_image_path;
}
