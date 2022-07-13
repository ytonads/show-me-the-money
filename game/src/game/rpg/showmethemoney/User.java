package game.rpg.showmethemoney;

public class User extends Menu {			

	public static int userStamina = 100;
	private int damage;
	
	public User() {}

	public static int getUserStamina() {
		return userStamina;
	}

	public static void setUserStamina(int userStamina) {
		User.userStamina = userStamina;
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void userDeath() {				
		if(User.userStamina < 1) {
			User.userStamina = 0;
		}
	}

	@Override
	public void strongDamage() {								
		this.damage = (int) ((Math.random()*6) + 25);
		userStamina -= 25;
	}

	@Override
	public void weakDamage() {
		this.damage = (int) ((Math.random()*6) + 10);
		userStamina -= 15;
	}

	@Override
	public void rest() {
		userStamina = 100;
	}
}
