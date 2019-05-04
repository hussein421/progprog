import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm.WordListener;

public class hangmann2 {

	
	public static void main(String[] args) { // main metoden 
		
		Scanner input = new Scanner(System.in); // s� att den kan l�sa charachtarer		
		
		ArrayList<String> easy= new ArrayList<>();// orden man skall gissa p� 
		easy.add("samar");
		easy.add("samira");
		easy.add("maryam");
		easy.add("haiwan");
		easy.add("kelb");
		int liv;
		String sjalva_ordet_easy = easy.get((int)(Math.random()*4)); // sj�lva ordet personen skall gissa p� slumpas fram
		
		ArrayList<String> medel= new ArrayList<>();// orden man skall gissa p� 
		medel.add("gta");
		medel.add("kaos");
		medel.add("shorba");
		medel.add("daxri");
		medel.add("khara");
		
		String sjalva_ordet_medel = medel.get((int)(Math.random()*4)); // sj�lva ordet personen skall gissa p� slumpas fram
		
		ArrayList<String> hard= new ArrayList<>();// orden man skall gissa p� 
		hard.add("lebron");
		hard.add("giannis");
		hard.add("antetekompuo");
		hard.add("kostas");
		hard.add("manopolas");
		
		String sjalva_ordet_hard = hard.get((int)(Math.random()*4)); // sj�lva ordet personen skall gissa p� slumpas fram
		
		
		int choice = meny(input);
	
		switch(choice) {
		case 1:
			liv=15;
			easy(sjalva_ordet_easy, liv, input);// anropar metoden
		
		case 2:
			liv=10;
			medel(sjalva_ordet_medel, liv, input);// anropar metoden
		
		case 3:
			liv=5;
			hard(sjalva_ordet_hard, liv, input);// anropar metoden
		}
		
		
		
	}
	
	static public int meny(Scanner input) {
		
		System.out.println("Hej och v�lkomen till mitt h�nga gubbe spel! ");
		System.out.println("V�lj vilken sv�rhetsgrad du vill spela p�!");
		System.out.println("(1) - l�tt?");
		System.out.println("(2) - medel?");
		System.out.println("(3) - sv�rt?");
		
		int choice = input.nextInt();
		
		return choice;
		
	}
	
	static public void easy(String sjalva_ordet_easy, int liv, Scanner input) {// hela sj�lva metoden 
		char[] gissa_ordet = new char [sjalva_ordet_easy.length()];
		int i=0;
		while(i<sjalva_ordet_easy.length()) { // omvandlar ordet till ---
			gissa_ordet[i]='-';
			if(sjalva_ordet_easy.charAt(i) == (' ')) {
				gissa_ordet[i]=' ';
			}
			i++;
		}
			
				System.out.println("du har s� h�r m�nga liv: " + liv);
				System.out.print("Det h�r �r ordet du ska gissa p�:    ");
				System.out.println(gissa_ordet);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar p� sparas h�r

		
		while(liv == 15) {
			char bokstaver = input.next().charAt(0); // personen gissar bokst�ver
			
			 if(log.contains(bokstaver)) { // om man gissar p� samma sak mer �n en g�ng
					
					System.out.println("bokstaven har du redan gissat p�, gissa p� en annan bokstav!");
					
					continue; // while loopen fors�tter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_easy.contains(bokstaver+"")) { // kollar om personer gissar r�tt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet.length; x++) {
					if(sjalva_ordet_easy.charAt(x) == (bokstaver)) {
						gissa_ordet[x]=bokstaver;
					}
				}
			}
			else {
				liv--;
			}
	if(sjalva_ordet_easy.equals(String.valueOf(gissa_ordet))) { //ifall persone gissar r�tt p� hela ordet
				System.out.println(sjalva_ordet_easy);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert = input.nextLine();// den hoppar �ver denna f�r n�n anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv=15;
				}
				else {
					System.out.println("okej hejd�");
				}
				
	}
			
			
			System.out.print(gissa_ordet);
			System.out.println("          liv kvar:"+liv);
		}
		if(liv == 0) {
			System.out.println("Du f�rlora och ordet var: " + sjalva_ordet_easy);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert = input.nextLine(); // den hoppar �ver denna f�r n�n anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv=15;
			}
			else {
				System.out.println("okej hejd�");
				
			}
		}
	}
	
	static public void medel(String sjalva_ordet_medel, int liv, Scanner input) {// hela sj�lva metoden 
		char[] gissa_ordet = new char [sjalva_ordet_medel.length()];
		int w=0;
		while(w<sjalva_ordet_medel.length()) { // omvandlar ordet till ---
			gissa_ordet[w]='-';
			if(sjalva_ordet_medel.charAt(w) == (' ')) {
				gissa_ordet[w]=' ';
			}
			w++;
		}
			
				System.out.println("du har s� h�r m�nga liv: " + liv);
				System.out.print("Det h�r �r ordet du ska gissa p�:    ");
				System.out.println(gissa_ordet);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar p� sparas h�r

		
		while(liv==10) {
			char bokstaver = input.next().charAt(0); // personen gissar bokst�ver
			
			 if(log.contains(bokstaver)) { // om man gissar p� samma sak mer �n en g�ng
					
					System.out.println("bokstaven har du redan gissat p�, gissa p� en annan bokstav!");
					
					continue; // while loopen fors�tter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_medel.contains(bokstaver+"")) { // kollar om personer gissar r�tt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet.length; x++) {
					if(sjalva_ordet_medel.charAt(x) == (bokstaver)) {
						gissa_ordet[x]=bokstaver;
					}
				}
			}
			else {
				liv--;
			}
	if(sjalva_ordet_medel.equals(String.valueOf(gissa_ordet))) { //ifall persone gissar r�tt p� hela ordet
				System.out.println(sjalva_ordet_medel);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert = input.nextLine();// den hoppar �ver denna f�r n�n anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv=10;
				}
				else {
					System.out.println("okej hejd�");
				}
				
	}
			
			
			System.out.print(gissa_ordet);
			System.out.println("          liv kvar:"+liv);
		}
		if(liv == 0) {
			System.out.println("Du f�rlora och ordet var: " + sjalva_ordet_medel);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert = input.nextLine(); // den hoppar �ver denna f�r n�n anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv=10;
			}
			else {
				System.out.println("okej hejd�");
			}
		}
	}
	static public void hard(String sjalva_ordet_hard, int liv, Scanner input) {// hela sj�lva metoden 
		char[] gissa_ordet = new char [sjalva_ordet_hard.length()];
		int q=0;
		while(q<sjalva_ordet_hard.length()) { // omvandlar ordet till ---
			gissa_ordet[q]='-';
			if(sjalva_ordet_hard.charAt(q) == (' ')) {
				gissa_ordet[q]=' ';
			}
			q++;
		}
			
				System.out.println("du har s� h�r m�nga liv: " + liv);
				System.out.print("Det h�r �r ordet du ska gissa p�:    ");
				System.out.println(gissa_ordet);
		
		
		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar p� sparas h�r

		
		while(liv==5) {
			char bokstaver = input.next().charAt(0); // personen gissar bokst�ver
			
			 if(log.contains(bokstaver)) { // om man gissar p� samma sak mer �n en g�ng
					
					System.out.println("bokstaven har du redan gissat p�, gissa p� en annan bokstav!");
					
					continue; // while loopen fors�tter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet_hard.contains(bokstaver+"")) { // kollar om personer gissar r�tt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet.length; x++) {
					if(sjalva_ordet_hard.charAt(x) == (bokstaver)) {
						gissa_ordet[x]=bokstaver;
					}
				}
			}
			else {
				liv--;
			}
	if(sjalva_ordet_hard.equals(String.valueOf(gissa_ordet))) { //ifall persone gissar r�tt p� hela ordet
				System.out.println(sjalva_ordet_hard);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("(1) - ja ");
				
				System.out.println("(2) - nej ");
				
				String buffert = input.nextLine();// den hoppar �ver denna f�r n�n anledning
				
				String svar= input.nextLine();
				
				if(svar.equals("1")) {
					liv=5;
				}
				else {
					System.out.println("okej hejd�");
				}
				
	}
			
			
			System.out.print(gissa_ordet);
			System.out.println("          liv kvar:"+liv);
		}
		if(liv == 0) {
			System.out.println("Du f�rlora och ordet var: " + sjalva_ordet_hard);
			
			System.out.println("vill du spela igen?");
			
			System.out.println("(1) - ja ");
			
			System.out.println("(2) - nej ");
			
			String buffert = input.nextLine(); // den hoppar �ver denna f�r n�n anledning
			
			String svar= input.nextLine();
			
			if(svar.equals("1")) {
				liv=5;
			}
			else {
				System.out.println("okej hejd�");
			}
		}
	}


}
