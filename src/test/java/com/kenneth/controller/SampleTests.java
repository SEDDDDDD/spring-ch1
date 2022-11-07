package com.kenneth.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kenneth.sample.Restaurant;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// -> 스프링 컨테이너 객체를 생성한 후 테스트에 사용가능하도록





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class SampleTests {
	
	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		restaurant=null;
		assertNotNull(restaurant); // 변수가 null 이 아니어야 테스트가 성공함을 의미
		
		System.out.println("test debugging");
		log.info(restaurant);
		log.info("---------------------");
		log.info(restaurant.getChef());
	}
}
	
	

