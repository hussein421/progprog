import java.util.Scanner;


public class InbyggdaMetoder {
		
	static double KlotVolym(double r) {
		double volym = 4*Math.PI*Math.pow(r,3);
		return volym;
	}
	static String reverse(String str) {
		Scanner input= new Scanner(System.in);
	     String reverse= input.nextLine();
	     for(char i: str.toCharArray()) {
	    	 reverse= i + reverse; 
	     }
	        return reverse;
	}
	static int count(String str, char c) {
		
	}
}
