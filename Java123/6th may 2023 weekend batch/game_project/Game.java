package game_project;
import java.util.Scanner;
public class Game {
	
	Weapon pressWeaponButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Score");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("You got the Gun");
			Gun g=new Gun();
			return g;
		}
		else
		{
			System.out.println("Press 1 for Knife, 2 for Gun and 3 for Bomb");
			int x=sc.nextInt();
			switch(x)
			{
				case 1:
					System.out.println("You got the Knife");
					Knife k=new Knife();
					return k;
				case 2:
					System.out.println("You got the Gun");
					Gun g=new Gun();
					return g;
				case 3:
					System.out.println("You got the Bomb");
					Bomb b=new Bomb();
					return b;
				default :
					System.out.println("Invalid Input");
					return null;	
			}
		}
	}

}







