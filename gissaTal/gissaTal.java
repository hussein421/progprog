import java.util.InputMismatchException;
import java.util.Scanner;

public class gissaTal {

	public static void main(String[] args) {
		boolean playing = true;
		int antal = 0;
		Scanner input = new Scanner(System.in);
		int Nummret = 0;
		int detNummretPersonenSkriver = 0;

		while (playing) {

			
			if (antal == 0) {
				Nummret = (int) (Math.random() * 10 + 1);
				System.out.println("gissa p� ett tal mellan 1-10");
			}
			antal++;// antal f�rs�k
			boolean guessing =true;
			while(guessing) {
				try {
					detNummretPersonenSkriver = input.nextInt(); // personens input
					guessing = false;
				} catch (InputMismatchException e) {
					guessing = true;
					System.out.println("Det �r inte ett tal, du m�ste gissa p� ett tal!");
					input.nextLine();
				}
			}
			
			
			if ( detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 10  ){
				System.out.println( detNummretPersonenSkriver + " �r inte ett giltligt giss, f�rs�k igen!");
			} else if (detNummretPersonenSkriver > Nummret) {
				System.out.println("mitt tal �r l�gre, f�rs�k igen!");

			} else if (detNummretPersonenSkriver < Nummret) {
				System.out.println("mitt tal �r h�gre, f�rs�k igen!");
			}  else {
				System.out.println("R�tt, det tog dig " + antal + " f�rs�k dock");
				System.out.println("vill du spela igen? i s� fall skrev ja");

				String buffer = input.nextLine();// den skippar denna linejn f�r n�n annledning
				String froga = input.nextLine();
				if (froga.equals("ja")) {
					antal = 0;
					playing = true;
				} else {
					System.out.println("okej hejd�");
					break;
				}

			}
		}

	}
}
