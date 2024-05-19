package exception;

public class Registration {
	
	public static void checkEligiblity(int age) throws UnderAgeException
	{
		if(age>=18)
		{
			System.out.println("You are ELigiblie for registration");
		}
		else
		{
			throw new UnderAgeException();
		}
		
	}

}
