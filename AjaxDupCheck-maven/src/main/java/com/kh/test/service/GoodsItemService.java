package com.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.test.dto.GoodsItem;
import com.kh.test.mapper.GoodsItemMapper;

@Service
public class GoodsItemService {

	@Autowired
	private GoodsItemMapper goodsItemMapper;
	
	public boolean existsByName(String itemName) {
		GoodsItem count = goodsItemMapper.existsByName(itemName);
		
		Integer totalCount = count != null ? count.getItemCount() : 0;
		// count가 null이 아니면 DTO에서 itemCount값을 할당해서 totalCount에 숫자형태로 넣고 
		// 그렇지 않으면 totalCount에 0의 값을 넣어라
		return totalCount != null && totalCount > 0;
		// totalCount가 null이 아니고 0보다 크면 true로 반환
		// 그렇지 않으면(0보다 작거나 같은값이면) false로 반환
	}
}
