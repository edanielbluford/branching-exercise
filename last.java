import java.util.Scanner;

public class last {

	public static void last(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Ask for the users last name
				System.out.println("Now, may I have your last name?");
				String userLast = input.next();
				
		//Text response for users last name
				System.out.println("Ah, " + userLast.toUpperCase() + ", strong last name. Suits you. ");

	}

}
