package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.khmall.dto.Member;

@Mapper
public interface MemberMapper {

	Member getLogin(@Param("email") String email,
					@Param("password") String password);
}
