package exception;
import java.util.Scanner;
public class RegistrationDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the age: ");
		int age=sc.nextInt();
		try {
			Registration.checkEligiblity(age);
		}
		catch(UnderAgeException e)
		{
			System.out.println("You are UnderAge");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("program ends!!");
	}

}
