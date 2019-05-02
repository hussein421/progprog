import java.util.ArrayList;
import java.util.Scanner;

import hangman.HangmanConsoleWindow;

public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HangmanConsoleWindow window = new HangmanConsoleWindow();
		
		boolean spelet = true;
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nameList= new ArrayList<>();
		nameList.add("samar");
		nameList.add("samira");
		nameList.add("maryam");
		nameList.add("haiwan");
		nameList.add("kelb");
		
		int liv = 0;
		
		String sjalva_ordet = nameList.get((int)(Math.random()*4));
		String giss_ordet = "";
		
		ArrayList<Character> log= new ArrayList<>();
		
		
		int choice = meny(input);
		while(spelet) {
			
			
			
			switch (choice) {
			case 1:
				giss_ordet = sjalva_ordet.replaceAll("[a-zA-Z]", "-");
				System.out.println(giss_ordet);
				
				
			
			}
			
		}
	
	
	}
	static int meny(Scanner input) {

		System.out.println("välkomen till mitt hänga gubbe spel! välj hur många liv du önskar ha");
		System.out.println("(1) -  5 liv?");
		System.out.println("(2) - 10 liv?");
		System.out.println("(3) - 15 liv?");
		System.out.println("(4) - 20 liv?");
		System.out.println("(5) - 35 liv?");
		
		int choice = input.nextInt();
		
		return choice;
		
	}
	static int right(Scanner input, ArrayList<Character> log, String sjalva_ordet) {
		boolean temp = true;
		while(temp) {
		char bokstaver = input.next().charAt(0);
		if(log.contains(bokstaver)) {
			System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");
			System.out.println(sjalva_ordet);
		}
		else if(!log.contains(bokstaver)) {
			log.add(bokstaver);
			if(sjavla_ordet.contains)
		}
		else if(log.contains)
		}
		
	}
	
}
