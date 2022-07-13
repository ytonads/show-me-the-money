package com.showmethemoney.manager;

import com.showmethemoney.dto.GameDTO;

public class User {
		
	GameDTO dto = new GameDTO();
	
	//유저의 휴식
	public void rest() {
		dto.setUserStamina(100);
		System.out.println("유저의 체력이 전부 회복되었습니다.");
	}

}
