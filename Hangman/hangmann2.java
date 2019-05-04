import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm.WordListener;

public class hangmann2 {
	
	static public void gissa(String sjalva_ordet, int liv ) {// omvandlar ordet till -
		char[] gissa_ordet = new char [sjalva_ordet.length()];
		int i=0;
		while(i<sjalva_ordet.length()) {
			gissa_ordet[i]='-';
			if(sjalva_ordet.charAt(i) == (' ')) {
				gissa_ordet[i]=' ';
			}
			i++;
		}
		System.out.print(gissa_ordet);
		System.out.println("          liv kvar:"+liv);
		
		Scanner input = new Scanner(System.in); // s� att den kan l�sa charachtarer		
		
		while(liv>0) {
			char bokstaver = input.next().charAt(0); // personen gissar bokst�ver
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
				System.out.println(gissa_ordet);
				System.out.println("Du klara det!!");
				
	}
			
			
			System.out.print(gissa_ordet);
			System.out.println("          liv kvar:"+liv);
		}
		if(liv == 0) {
			System.out.println("Du f�rlora och ordet var: " + gissa_ordet);
		}
	}
	
	
	public static void main(String[] args) {
	
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

}
