package com.kenneth.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kenneth.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;
	
	
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());	// 실제 동작하는 클래스의 이름 확인
		log.info(timeMapper.getTime());	// 해당 인터페이스의 함수 호출
		log.info("-------------------------------");
		
	}
	
	@Test
	public void testGetTime2() {
		log.info("-------------------------------");
		log.info("getTime2");	// 실제 동작하는 클래스의 이름 확인
		log.info(timeMapper.getTime2());	// 해당 인터페이스의 함수 호출
		
	}
	
	
	
}
