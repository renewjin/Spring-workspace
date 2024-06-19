package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Goods;

@Mapper
public interface ProductMapper {
	// 매개변수로 전달되는 Goods 객체는 상품의 세부 정보를 포함하고 있음
	void insertProduct(Goods goods);
	
	// 상품을 모두 가져올 때는 List Array 배열
	// List로 상품들을 진열하겠다 상품 리스트 목록
	// getAllProduct() 데이터베이스에서 모든 상품을 가져오는 메소드
	// List<Goods> getAllProduct() -> 데이터베이스에 있는 모든 데이터를 가져와 반환하고(Goods 객체로??) Goods객체를 리스트로 반환함
	List<Goods> getAllProduct();
}
