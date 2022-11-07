package com.kenneth.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;


@Component
@Data
public class Restaurant {

//	1. 필드 주입 : @Autowired
//	2. 생성자 주입 : @RequiredArgsConstructor
//	3. setter 주입 : @Setter(onMethod_ = @Autowired)
	
	
	
	
	
	// 자동 setter 생성
	//	LomBok-Setter-onMethod_ 속성: 생성되는 setter에 추가할 어노테이션 지정
	//	@Autowired : 필요한 의존객체의 "타입"에 해당하는 빈을 찾아 주입
//					 즉, 해당 필드 및 메서드에 스프링이 관리하는 Bean 을 자동으로 매핑
//					 생성자, setter, 필드
	
	
	
//	@Autowired				// 필드 주입
//	@RequiredArgsConstructor // 생성자 주입	
	
	@Setter(onMethod_ = @Autowired)		// 세터(수정자) 주입
	private Chef chef;
	
	
//	static Chef chef_baek = new Chef();
//	public static void main(String[] args) {
//		Chef chef_baek = new Chef();
//		chef_baek.setCookingSkills(88);
//		System.out.println("요리능력 :"+chef_baek.getCookingSkills());
//
//
//	}

}
