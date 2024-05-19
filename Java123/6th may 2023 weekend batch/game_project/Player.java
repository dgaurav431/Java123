package game_project;

public class Player {
	public static void main(String[] args) {
		Game g=new Game();
		Weapon w=g.pressWeaponButton();
		//Weapon w=new Knife(), new Gun(), new Bomb();
		w.use();
		System.out.println("Program completed");
		
	}

}
