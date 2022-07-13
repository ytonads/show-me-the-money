package com.showmethemoney.manager;

import java.util.Scanner;

import com.showmethemoney.dto.GameDTO;

public class Function {
	
	User user = new User();
	GameDTO dto = new GameDTO();
	GameManager gm = new GameManager();
	
	public void Find() {
		
		int ran = (int) ((Math.random()*10) + 1);
		if(ran < 9) {
			System.out.println("랜덤값 : " + ran);
			System.out.println("지금 스테미너는 : " + dto.getUserStamina());
			System.out.println();
			Fight();
		}//if 9미만 스테미너 감소
		else {
			System.out.println("랜덤값 : " + ran);
			int temp = dto.getUserStamina()-120;
			dto.setUserStamina(temp);
			System.out.println("지금 스테미너는 : " + dto.getUserStamina());
			System.out.println();
			System.out.println("산적을 발견하지 못했습니다... 스태미너가 소폭(-20) 감소합니다.");  //하락합니다 -> 감소합니다 수정
			System.out.println();
			Fight();
		}
	}

	public void Fight() {
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("산적을 발견하였습니다. 어떻게 하시겠습니까?");
			System.out.println("1. 강공격 (데미지 25~30, 스태미너 감소량 25)");  //공격 데미지, 스태미너 감소량 수정
			System.out.println("2. 약공격 (데미지 10~15, 스태미너 감소량 10)");
			System.out.print("공격을 선택하세요. : ");
			int chNum = sc.nextInt();
			dto.setCheckNum(chNum);
			
			System.out.println("강약 선택 번호 : " + dto.getCheckNum());
			
			if(dto.getCheckNum() == 1) {
				StaminaUser();
				StaminaBandit();
				Ending();
			} else if((dto.getCheckNum() == 2)) {
				StaminaUser();
				StaminaBandit();
				Ending();
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}//While end

	}//Fight end

	public void StaminaUser() {
		
		System.out.println();
		
		if(dto.getCheckNum()==1) {
			dto.setTemp((int) ((Math.random()*6) + 25));
			dto.setUserDamage(dto.getTemp());
			dto.setUserStamina(-25);
			System.out.println("강공격을 시전하여 " + dto.getUserDamage() + "의 피해를 입혔습니다!");
			System.out.println("유저의 스태미너가 25 감소했습니다.");		//유저 스태미너 감소량 표시 추가
			
		} else if (dto.getCheckNum()==2){
			System.out.println("강약번호 다시 체크 : " + dto.getCheckNum());
			dto.setTemp((int) ((Math.random()*6) + 25));
			dto.setUserDamage(dto.getTemp());
			dto.setUserStamina(-15);;
			System.out.println("약공격을 시전하여 " + dto.getUserDamage() + "의 피해를 입혔습니다!");
			System.out.println("유저의 스태미너가 15 감소했습니다.");		//유저 스태미너 감소량 표시 추가
		}
		
		System.out.println("유저의 남은 스태미너 : " + dto.getUserStamina());
	
	}
	
	public void StaminaBandit() {
		
		dto.setBanditStamina(dto.getTemp());
			
		System.out.println("산적의 남은 스테미너 : " + dto.getBanditStamina());
		System.out.println();
		
	}
	
	public void Ending() {
		if(dto.getUserStamina() <= 0 && dto.getBanditStamina() <= 0) {
			System.out.println("\n치열한 전투 끝에 산적도 죽고 당신도 죽었습니다.");
			System.out.println("당신의 재산은 아무도 찾지 못합니다.");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}else if(dto.getUserStamina() <= 0) {
			System.out.println("\n당신은 사망했습니다. ");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}else if (dto.getBanditStamina() <= 0){
			System.out.println("\n산적이 쓰러졌습니다! \n당신의 재산은 물론, 산적의 재산까지 획득했습니다!");
			System.out.println("게임을 종료합니다.");
			System.exit(0);											//게임이 종료됐으니 return 추가							
		}
	}
	
}
