package com.kenneth.sample;

import org.springframework.stereotype.Component;

import lombok.Data;


//Chef.java 파일 아이콘에 S 표시가 있으면 스프링 관리대상


@Component
@Data	// Lombok-Data : getter/setter, 생성자, toString()
public class Chef {
	private int cookingSkills;
	
//	public Chef() {
//	}

//	public int getCookingSkills() {
//		return cookingSkills;
//	}
//	
//	public void setCookingSkills(int cookingSkills) {
//		this.cookingSkills = cookingSkills;
//	}



}
		
