package com.kh.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kh.test.dto.GoodsItem;

@Mapper
public interface GoodsItemMapper {

	GoodsItem existsByName(@Param("itemName") String itemName);
}
