import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm.WordListener;

public class hangmann2 {

	
	public static void main(String[] args) { // main metoden 
		
		Scanner input = new Scanner(System.in); // så att den kan läsa charachtarer		
		
		ArrayList<String> easy= new ArrayList<>();// orden man skall gissa på 
		easy.add("samar");
		easy.add("samira");
		easy.add("maryam");
		easy.add("haiwan");
		easy.add("kelb");
		
		String sjalva_ordet_easy = easy.get((int)(Math.random()*4)); // själva ordet personen skall gissa på slumpas fram
		
		ArrayList<String> medel= new ArrayList<>();// orden man skall gissa på 
		medel.add("gta");
		medel.add("kaos");
		medel.add("shorba");
		medel.add("daxri");
		medel.add("khara");
		
		String sjalva_ordet_medel = medel.get((int)(Math.random()*4)); // själva ordet personen skall gissa på slumpas fram
		
		ArrayList<String> hard= new ArrayList<>();// orden man skall gissa på 
		hard.add("lebron");
		hard.add("giannis");
		hard.add("antetekompuo");
		hard.add("kostas");
		hard.add("manopolas");
		
		String sjalva_ordet_hard = hard.get((int)(Math.random()*4)); // själva ordet personen skall gissa på slumpas fram
		
		
		int choice = meny(input);
	
		switch(choice) {
		case 1:
			
			easy(sjalva_ordet_easy, input);// anropar metoden
			break;
		case 2:
			
			medel(sjalva_ordet_medel, input);// anropar metoden
			break;
		case 3:
			
			hard(sjalva_ordet_hard, input);// anropar metoden
			break;
		}
		
		
		
	}
	
	static public int meny(Scanner input) {
		
		System.out.println("Hej och välkomen till mitt hänga gubbe spel! ");
		System.out.println("Vilken svårhetsgrad vill du spela på?");
		System.out.println("(1) - lätt?");
		System.out.println("(2) - medel?");
		System.out.println("(3) - svårt?");
		
		int choice = input.nextInt();
		
		return choice;
		
	}
	
	static public void easy(String sjalva_ordet_easy, Scanner input) {// hela själva metoden 
		char[] gissa_ordet_easy = new char [sjalva_ordet_easy.length()];
		int i=0;
		int liv = 15;
		while(i<sjalva_ordet_easy.length()) { // omvandlar ordet till ---
			gissa_ordet_easy[i]='-';
			if(sjalva_ordet_easy.charAt(i) == (' ')) {
				gissa_ordet_easy[i]=' ';
			}
			i++;
		}
			
				System.out.println("du har så här många liv: " + liv);
				System.out.print("Det här är ordet du ska gissa på:    ");
				System.out.println(gissa_ordet_easy);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar på sparas här

		
		while(liv>0) {
			char bokstaver = input.next().charAt(0); // personen gissar bokstäver
			
			 if(log.contains(bokstaver)) { // om man gissar på samma sak mer än en gång
					
					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");
					
					continue; // while loopen forsätter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_easy.contains(bokstaver+"")) { // kollar om personer gissar rätt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet_easy.length; x++) {
					if(sjalva_ordet_easy.charAt(x) == (bokstaver)) {
						gissa_ordet_easy[x]=bokstaver;
					}
				}
			}
			else {
				liv--;
			}
	if(sjalva_ordet_easy.equals(String.valueOf(gissa_ordet_easy))) { //ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_easy);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert = input.nextLine();// den hoppar över denna för nån anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv=15;
				}
				else {
					System.out.println("okej hejdå");
				}
				
	}
			
			
			System.out.print(gissa_ordet_easy);
			System.out.println("          liv kvar:"+liv);
			System.out.println("Du har gissat på:" + Arrays.asList(log));
			
		}
		if(liv == 0) {
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_easy);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert = input.nextLine(); // den hoppar över denna för nån anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv=15;
			}
			else {
				System.out.println("okej hejdå");
				
			}
		}
	}
	
	
	static public void hard(String sjalva_ordet_hard, Scanner input) {// hela själva metoden 
		char[] gissa_ordet_hard = new char [sjalva_ordet_hard.length()];
		int liv_hard =5;
		int q=0;
		while(q<sjalva_ordet_hard.length()) { // omvandlar ordet till ---
			gissa_ordet_hard[q]='-';
			if(sjalva_ordet_hard.charAt(q) == (' ')) {
				gissa_ordet_hard[q]=' ';
			}
			q++;
		}
			
				System.out.println("du har så här många liv: " + liv_hard);
				System.out.print("Det här är ordet du ska gissa på:    ");
				System.out.println(gissa_ordet_hard);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar på sparas här

		
		while(liv_hard>0) {
			char bokstaver = input.next().charAt(0); // personen gissar bokstäver
			
			 if(log.contains(bokstaver)) { // om man gissar på samma sak mer än en gång
					
					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");
					
					continue; // while loopen forsätter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_hard.contains(bokstaver+"")) { // kollar om personer gissar rätt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet_hard.length; x++) {
					if(sjalva_ordet_hard.charAt(x) == (bokstaver)) {
						gissa_ordet_hard[x]=bokstaver;
					}
				}
			}
			else {
				liv_hard--;
			}
	if(sjalva_ordet_hard.equals(String.valueOf(gissa_ordet_hard))) { //ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_hard);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert3 = input.nextLine();// den hoppar över denna för nån anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv_hard=5;
				}
				else {
					System.out.println("okej hejdå");
				}
				
	}
			
			
			System.out.print(gissa_ordet_hard);
			System.out.println("          liv kvar:"+liv_hard);
			System.out.println("Du har gissat på:" + Arrays.asList(log));
		}
		if(liv_hard == 0) {
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_hard);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert = input.nextLine(); // den hoppar över denna för nån anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv_hard=5;
			}
			else {
				System.out.println("okej hejdå");
			}
		}
	}
	static public void medel(String sjalva_ordet_medel, Scanner input) {// hela själva metoden 
		char[] gissa_ordet = new char [sjalva_ordet_medel.length()];
		int w=0;
		int liv_medel = 10;
		while(w<sjalva_ordet_medel.length()) { // omvandlar ordet till ---
			gissa_ordet[w]='-';
			if(sjalva_ordet_medel.charAt(w) == (' ')) {
				gissa_ordet[w]=' ';
			}
			w++;
		}
			
				System.out.println("du har så här många liv: " + liv_medel);
				System.out.print("Det här är ordet du ska gissa på:    ");
				System.out.println(gissa_ordet);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar på sparas här

		
		while(liv_medel>0) {
			char bokstaver = input.next().charAt(0); // personen gissar bokstäver
			
			 if(log.contains(bokstaver)) { // om man gissar på samma sak mer än en gång
					
					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");
					
					continue; // while loopen forsätter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_medel.contains(bokstaver+"")) { // kollar om personer gissar rätt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet.length; x++) {
					if(sjalva_ordet_medel.charAt(x) == (bokstaver)) {
						gissa_ordet[x]=bokstaver;
					}
				}
			}
			else {
				liv_medel--;
			}
	if(sjalva_ordet_medel.equals(String.valueOf(gissa_ordet))) { //ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_medel);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert = input.nextLine();// den hoppar över denna för nån anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv_medel=10;
				}
				else {
					System.out.println("okej hejdå");
				}
				
	}
			
			
			System.out.print(gissa_ordet);
			System.out.println("          liv kvar:"+liv_medel);
			System.out.println("Du har gissat på:" + Arrays.asList(log));
		}
		if(liv_medel == 0) {
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_medel);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert2 = input.nextLine(); // den hoppar över denna för nån anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv_medel =10;
			}
			else {
				System.out.println("okej hejdå");
			}
		}
	}


}
