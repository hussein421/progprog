import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm.WordListener;

public class hangmann2 {

	
	public static void main(String[] args) { // main metoden 
		
		ArrayList<String> nameList= new ArrayList<>();// orden man skall gissa p� 
		nameList.add("samar");
		nameList.add("samira");
		nameList.add("maryam");
		nameList.add("haiwan");
		nameList.add("kelb");
		int liv=5;
		String sjalva_ordet = nameList.get((int)(Math.random()*4)); // sj�lva ordet personen skall gissa p� slumpas fram
		
		
		gissa(sjalva_ordet, liv);// anropar metoden
		
	}
	
	static public void gissa(String sjalva_ordet, int liv ) {// hela sj�lva metoden 
		char[] gissa_ordet = new char [sjalva_ordet.length()];
		int i=0;
		while(i<sjalva_ordet.length()) { // omvandlar ordet till ---
			gissa_ordet[i]='-';
			if(sjalva_ordet.charAt(i) == (' ')) {
				gissa_ordet[i]=' ';
			}
			i++;
		}
				System.out.println("hej och v�lkomen till mitt h�nga gubbe spel!");
				System.out.println("du har s� h�r m�nga liv kvar:" + liv);
				System.out.print(gissa_ordet);
		
		
		Scanner input = new Scanner(System.in); // s� att den kan l�sa charachtarer		

		ArrayList<Character> log= new ArrayList<>(); // charactarerna personen gissar p� sparas h�r

		
		while(liv>0) {
			char bokstaver = input.next().charAt(0); // personen gissar bokst�ver
			
			 if(log.contains(bokstaver)) { // om man gissar p� samma sak mer �n en g�ng
					
					System.out.println("bokstaven har du redan gissat p�, gissa p� en annan bokstav!");
					
					continue; // while loopen fors�tter
					}
			
			log.add(bokstaver);
			
			if(sjalva_ordet.contains(bokstaver+"")) { // kollar om personer gissar r�tt och byter - med bokstaven
				for (int x = 0; x < gissa_ordet.length; x++) {
					if(sjalva_ordet.charAt(x) == (bokstaver)) {
						gissa_ordet[x]=bokstaver;
					}
				}
			}
			else {
				liv--;
			}
	if(sjalva_ordet.equals(String.valueOf(gissa_ordet))) { //ifall persone gissar r�tt p� hela ordet
				System.out.println(sjalva_ordet);
				System.out.println("Du klara det!!");
				System.out.println("vill du spela igen?");
				
				System.out.println("1-ja 2-nej");
				
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
			System.out.println("Du f�rlora och ordet var: " + sjalva_ordet);
			System.out.println("vill du spela igen?");
			System.out.println("1-ja 2-nej");
			
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
