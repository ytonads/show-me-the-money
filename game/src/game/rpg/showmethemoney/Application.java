package game.rpg.showmethemoney;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Bandit bd = new Bandit();
		User us = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("산적이 당신의 전 재산을 훔쳐갔습니다. \n");			
		while(User.userStamina > 0 && Bandit.banditStamina > 0) {
			System.out.println("현재 스태미너 : " + User.userStamina);
			System.out.println("1. 전 재산을 되찾으러 가시겠습니까?");    
			System.out.println("2. 휴식을 취하시겠습니까?");
			System.out.println("3. 전 재산을 찾지 않고 가만히 계시겠습니까? \n");                                                  
			System.out.print("번호를 선택하세요 : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {
			
			case 1 :
				int ran = (int) ((Math.random()*10) + 1);				
																		
				if(ran < 9) {
					System.out.println("\n산적을 발견하였습니다. 어떻게 하시겠습니까? \n");
					while(User.userStamina > 0 && Bandit.banditStamina > 0) {
					System.out.println("1. 강공격 (데미지 25~30, 스태미너 감소량 25)");  
					System.out.println("2. 약공격 (데미지 10~15, 스태미너 감소량 10)");
					System.out.print("공격을 선택하세요. : ");
					int attackNum = sc.nextInt();
					
					if(attackNum == 1) {
						System.out.println();
						us.strongDamage();
						Bandit.banditStamina -= us.getDamage();
						us.userDeath();
						bd.banditDeath();
						System.out.println("강공격을 시전하여 " + us.getDamage() + "의 피해를 입혔습니다!");
						System.out.println("유저의 스태미너가 25 감소했습니다.");		
						System.out.println("유저의 남은 스태미너 : " + User.userStamina);
						System.out.println("산적의 남은 스태미너 : " + Bandit.banditStamina + "\n");
						continue;
					}else if (attackNum == 2){
						System.out.println();
						us.weakDamage();
						Bandit.banditStamina -= us.getDamage();
						us.userDeath();
						bd.banditDeath();
						System.out.println("약공격을 시전하여 " + us.getDamage() + "의 피해를 입혔습니다!");
						System.out.println("유저의 스테미너가 15 감소했습니다.");
						System.out.println("유저의 남은 스태미너 : " + User.userStamina);
						System.out.println("산적의 남은 스태미너 : " + Bandit.banditStamina + "\n");
					}else {
						System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
					}
					}
					
				}else {
					User.userStamina -= 20;
					System.out.println("산적을 발견하지 못했습니다... 스태미너가 소폭(20) 감소합니다. \n"); 
					
				}continue;

			case 2 :
				us.rest();
				System.out.println("\n스태미너가 전부 회복 되었습니다.");
				System.out.println();		
				break;
				
			case 3 : 
				System.out.println("\n당신은 굶어 죽었습니다.");
				System.out.println("게임이 종료 되었습니다.");
				return;
				
			default : 
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요. \n");												
			}
		}
		
		if(User.userStamina < 1 && Bandit.banditStamina < 1) {
			System.out.println("\n치열한 전투 끝에 산적도 죽고 당신도 죽었습니다.");
			System.out.println("당신의 재산은 아무도 찾지 못합니다.");
			System.out.println("게임을 종료합니다.");
			return;
		}else if(User.userStamina < 1) {
			System.out.println("\n당신은 사망했습니다. ");
			System.out.println("게임을 종료합니다.");
			return;
		}else {
			System.out.println("\n산적이 쓰러졌습니다! \n당신의 재산은 물론, 산적의 재산까지 획득했습니다!");
			System.out.println("게임을 종료합니다.");
			return;																		
		}

	}

}

