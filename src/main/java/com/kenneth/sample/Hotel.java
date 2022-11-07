package com.kenneth.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// 의존성 주입을 사용하여 Hotel 클래스를 작성하시오
//(이때 Hotel 클래스는 Chef 클래스를 사용하도록 작성할 것.)
// 테스트 코드 작성 및 수행


@Component
//@Data
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class Hotel {
//	@Autowired
//	@NonNull
	private final Chef chef;
//	@NonNull
	private final int room = 100;
	
//	public hotel(Chef chef, int room) {
//		this.chef = chef;
//		this.room = room;
//	}
	
	

	
	
}
