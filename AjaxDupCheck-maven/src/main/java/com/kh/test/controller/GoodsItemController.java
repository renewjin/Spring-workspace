package com.kh.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.test.service.GoodsItemService;

@Controller
public class GoodsItemController {
	
	@Autowired
	private GoodsItemService goodsItemService;
	
	@GetMapping("/check")
	public Map<String, Boolean> existsByName(@RequestParam String itemName) {
		boolean isCheck = goodsItemService.existsByName(itemName);
		//goodsItemService.existsByName() -> boolean 값으로 리턴함
		
		Map<String, Boolean> res = new HashMap<>();
		res.put("isCheck", isCheck);
		
		return res;
	}
}
