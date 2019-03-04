import java.util.InputMismatchException;
import java.util.Scanner;

public class gissaTal {

	public static void main(String[] args) {
		boolean playing = true;
		int antal = 0;//antal gissingar
		Scanner input = new Scanner(System.in);
		int Nummret = 0;
		int detNummretPersonenSkriver = 0;

		while (playing) {

			
			if (antal == 0) 
				{// den b�rjar om antal gissningar �r 0
				Nummret = (int) (Math.random() * 10 + 1);//gissning numret
				System.out.println("gissa p� ett tal mellan 1-10");
			}
			antal++;// antal gissningar g�r upp varje g�ng
			boolean guessing = true;
			while(guessing) {
				try {
					detNummretPersonenSkriver = input.nextInt(); // personens input
					guessing = false;
				} catch (InputMismatchException e) { // ifall det inte �r ett nummer s� s�ger den till att f�s�ka om ist�llet f�r att crasha 
					guessing = true;
					System.out.println("Det �r inte ett tal, du m�ste gissa p� ett tal!");
					input.nextLine();
				}
			}
			
			
			if ( detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 10  ){ // om man gissar ett nummer �ver 10 eller mindre �n 1 s� kommer det s�ga att det inte �r ett giltigt giss
				System.out.println( detNummretPersonenSkriver + " �r inte ett giltligt giss, f�rs�k igen!");
			} else if (detNummretPersonenSkriver > Nummret) { // gissen �r mindre �n talet
				System.out.println("mitt tal �r l�gre, f�rs�k igen!");

			} else if (detNummretPersonenSkriver < Nummret) { // gissen �r h�gre �n talet
				System.out.println("mitt tal �r h�gre, f�rs�k igen!");
			}  else {
				System.out.println("R�tt, det tog dig " + antal + " f�rs�k dock"); // n�r man gissar r�tt
				System.out.println("vill du spela igen? i s� fall skrev ja");

				String buffer = input.nextLine();// den skippar denna linejn f�r n�n annledning
				String froga = input.nextLine();
				if (froga.equals("ja")) {
					antal = 0; // antal f�rs�k resetar 
					playing = true; // k�r om spelet
				} else { // om man inte vill spela igen
					System.out.println("okej hejd�"); 
					break;
				}

			}
		}

	}

}