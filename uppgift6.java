import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String xchar = "x ";
		int bas=0;
		
		
		System.out.println("skriv din bas");
		bas=input.nextInt();
		
		for (int x = 1; x <=bas ; x++) {
			int space=bas-x;
			for (int y = 1; y<=space; y++) {
				System.out.print(" ");
			}
			System.out.println(xchar);
			xchar = xchar+"x ";
		}
	

	}

}
