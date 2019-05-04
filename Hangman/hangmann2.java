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
		
		Scanner input = new Scanner(System.in); // så att den kan läsa charachtarer		
	}
	
	
	public static void main(String[] args) {
	
		ArrayList<String> nameList= new ArrayList<>();// orden man skall gissa på 
		nameList.add("samar");
		nameList.add("samira");
		nameList.add("maryam");
		nameList.add("haiwan");
		nameList.add("kelb");
		int liv=5;
		String sjalva_ordet = nameList.get((int)(Math.random()*4)); // själva ordet personen skall gissa på slumpas fram
		gissa(sjalva_ordet, liv);// anropar metoden
		
	}

}
