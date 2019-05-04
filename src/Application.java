import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		boolean helpLoop = true;
		while (helpLoop) {
			Scanner input = new Scanner(System.in);
			System.out.println("What is your favorite ROYGBIV color?");
			System.out.println("Enter \"Help\" for a list of ROYGBIV colors.");
			String userColor = input.next();
			switch (userColor.toLowerCase()) {
			case "red":
				userColor = "red";
				helpLoop = false;
				break;
			case "orange":
				userColor = "orange";
				helpLoop = false;
				break;
			case "yellow":
				userColor = "yellow";
				helpLoop = false;
				break;
			case "green":
				userColor = "green";
				helpLoop = false;
				break;
			case "blue":
				userColor = "blue";
				helpLoop = false;
				break;
			case "indigo":
				userColor = "indigo";
				helpLoop = false;
				break;
			case "violet":
				userColor = "violet";
				helpLoop = false;
				break;
			case "help":
				System.out.println("The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				userColor = "help";
				break;

			}
		}

	}

}
