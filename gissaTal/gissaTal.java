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
				System.out.println("gissa på ett tal mellan 1-10");
			}
			antal++;// antal försök
			boolean guessing =true;
			while(guessing) {
				try {
					detNummretPersonenSkriver = input.nextInt(); // personens input
					guessing = false;
				} catch (InputMismatchException e) {
					guessing = true;
					System.out.println("Det är inte ett tal, du måste gissa på ett tal!");
					input.nextLine();
				}
			}
			
			
			if ( detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 10  ){
				System.out.println( detNummretPersonenSkriver + " Är inte ett giltligt giss, försök igen!");
			} else if (detNummretPersonenSkriver > Nummret) {
				System.out.println("mitt tal är lägre, försök igen!");

			} else if (detNummretPersonenSkriver < Nummret) {
				System.out.println("mitt tal är högre, försök igen!");
			}  else {
				System.out.println("Rätt, det tog dig " + antal + " försök dock");
				System.out.println("vill du spela igen? i så fall skrev ja");

				String buffer = input.nextLine();// den skippar denna linejn för nån annledning
				String froga = input.nextLine();
				if (froga.equals("ja")) {
					antal = 0;
					playing = true;
				} else {
					System.out.println("okej hejdå");
					break;
				}

			}
		}

	}
}
