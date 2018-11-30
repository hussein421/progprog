import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		Scanner skriv=new Scanner(System.in);
		double nr=1;
		double multi=1;
		double räkna=0;
		System.out.println("skriv in nummer: ");
		while(multi <= 100000) {
			
			nr = skriv.nextDouble();
			multi *= nr;
			räkna = räkna + 1;
			
			if (räkna == 10) {

				break;	
				
		}

	}
		System.out.println(multi);
	
}

}
