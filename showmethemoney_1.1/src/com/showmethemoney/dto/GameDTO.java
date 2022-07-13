package com.showmethemoney.dto;

public class GameDTO {
	
	//첫 번째 선택지 (찾기, 휴식, 종료)
	public int menuNum;

	//두 번째 선택지 (공격 타입)
	public int damageNum;
	
	//두 번째 선택지의 유저 데미지
	public int userDamage;
	
	//전투 강약 선택시 번호
	public int checkNum;

	public int temp;
	
	public int userStamina = 100;
	
	public int banditStamina = 100;
	
	
	public int getUserStamina() {
		return userStamina;
	}

	public void setUserStamina(int userStamina) {
		this.userStamina += userStamina;
	}

	public int getBanditStamina() {
		return banditStamina;
	}

	public void setBanditStamina(int banditStamina) {
		this.banditStamina -= banditStamina;
	}
	
	
	
	
	
	
	
	
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	public GameDTO() {}
	
	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}

	public int getDamageNum() {
		return damageNum;
	}

	public void setDamageNum(int damageNum) {
		this.damageNum = damageNum;
	}
	
	public int getUserDamage() {
		return userDamage;
	}

	public void setUserDamage(int userDamage) {
		this.userDamage = userDamage;
	}

}
