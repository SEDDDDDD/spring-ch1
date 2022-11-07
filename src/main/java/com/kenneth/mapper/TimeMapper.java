package com.kenneth.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
//	1. 어노테이션 방식
	@Select("select sysdate from dual")
	public String getTime();
//	2. mapper XML 파일 사용 방식
	public String getTime2();
		
	@Select("select * from product")
	public String test();
}
