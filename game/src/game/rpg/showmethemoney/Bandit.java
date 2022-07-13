package game.rpg.showmethemoney;

public class Bandit{

	public static int banditStamina = 100;

	public static int getBanditStamina() {
		return banditStamina;
	}

	public void banditDeath() {
		if(Bandit.banditStamina < 1) {
			Bandit.banditStamina = 0;
		}
	}
	
	
}
