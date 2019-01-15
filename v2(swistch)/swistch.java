import java.util.Scanner;

public class swistch {

	
		public static void main(String[] args) {

			// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
			// t ex en meny för användare

			Scanner input = new Scanner(System.in);
			int choice = 0; 
			
			do {
				
			choice = meny(input);
		
			String genre;

			switch (choice) {
			case 1:
				genre = "Somali";
				System.out.println("You chose " + genre + "! Here are three good names!");
				System.out.println();
				System.out.println("1. ahmed");
				System.out.println("2. hassan");
				System.out.println("3. abdi");
				System.out.println();
				//System.out.println("here are the other genere " +  meny(input) );
				break;
			case 2:
				genre = "SvenskaNamn";
				System.out.println("You chose " + genre + "! Here are three good names!");
				System.out.println();
				System.out.println("1. kalle");
				System.out.println("2. stiv");
				System.out.println("3. sven");
				System.out.println();
				//System.out.println("here are the other genere " +  meny(input) );
				break;
			case 3:
				genre = "Hälsingar";
				System.out.println("You chose " + genre + "! Here are three good welcomes!");
				System.out.println();
				System.out.println("1. hej");
				System.out.println("2. hello");
				System.out.println("3. hi");
				System.out.println();
				//System.out.println("here are the other genere " +  meny(input) );
				break;
			case 4:
				genre = "Haiwanat";
				System.out.println("You chose " + genre + "! Here are three good animalas!");
				System.out.println();
				System.out.println("1. kelb");
				System.out.println("2. hmar");
				System.out.println("3. moti");
				System.out.println();
				//System.out.println("here are the other genere " +  meny(input) );
				break;
			case 5:
				genre= "quit";
				System.out.println("bye");
				break;
			default:
				genre = "invalid";
				System.out.println("You have made a " + genre + " choice! Too bad for you!");
				System.out.println();
				break;
			} 
			}while (choice !=5); 
			input.close();
		}

	static int meny(Scanner input) {

		System.out.println("Welcome to movie inspiration database! Please choose a genre!");
		System.out.println("(1) - somali");
		System.out.println("(2) - svesnka namn");
		System.out.println("(3) - hälsningar");
		System.out.println("(4) - haiwanat");
		System.out.println("(5) - Quit");
		System.out.println();
		
		int choice = input.nextInt();
		
		return choice;
	}

	}


