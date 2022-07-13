package com.showmethemoney.manager;

import java.util.Scanner;

import com.showmethemoney.dto.GameDTO;

public class GameManager {

	public void mainMenu() {
		
		User user = new User();
		GameDTO dto = new GameDTO();
		Function function = new Function();		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("산적이 당신의 전 재산을 훔쳐갔습니다. \n");
		
		for(;;) {
	
			System.out.println("1. 전 재산을 되찾으러 가시겠습니까?");    
			System.out.println("2. 휴식을 취하시겠습니까?");
			System.out.println("3. 전 재산을 찾지 않고 가만히 계시겠습니까? \n");                                                  
			System.out.print("번호를 선택하세요 : ");
			int selNum = sc.nextInt();	
			dto.setMenuNum(selNum);
			
			if(dto.getMenuNum()==1) {
				function.Find();
				System.out.println();
			} else if (dto.getMenuNum()==2) {
				System.out.println();
				user.rest();
			} else if (dto.getMenuNum()==3) {
				System.out.println();
				System.out.println("당신은 굶어 죽었습니다.");
				System.out.println("게임이 종료 되었습니다.");
				return;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
			
		}
		
	}//MainMenu end
	
}//GameManager end
