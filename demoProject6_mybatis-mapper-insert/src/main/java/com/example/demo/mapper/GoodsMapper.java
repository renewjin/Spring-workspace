package com.example.demo.mapper;
/*완벽한 기능을 작성하는 공간이 아니라
 * Mapper.xml에 작성한 id 리스트를 모두 리스트만 작성하는 공간이기 때문에
 * interface로 작성
 * mapper.xml에 어떤 파일이 존재한다. 존재하는 리스트 작성란
 * @Mapper라는 어노테이션을 활용해서 Spring Boot가 Mapper를 찾을 수 있도록 설정
 * */

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Goods;

@Mapper //sql 사용할 리스트 목록, MyBatis에서 제공하는 애노테이션 인터페이스를 MyBatis 매퍼로 인식하도록
public interface GoodsMapper { // interface GoodsMapper : 데이터베이스와 상호작용하는 메서드 정의
	void insertGoods(Goods goods); // insertGoods 메서드는 Goods 객체를 데이터베이스에 삽입하는 sql연산을 수행 goods 
	
	
}
