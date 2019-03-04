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
				{// den börjar om antal gissningar är 0
				Nummret = (int) (Math.random() * 10 + 1);//gissning numret
				System.out.println("gissa på ett tal mellan 1-10");
			}
			antal++;// antal gissningar går upp varje gång
			boolean guessing = true;
			while(guessing) {
				try {
					detNummretPersonenSkriver = input.nextInt(); // personens input
					guessing = false;
				} catch (InputMismatchException e) { // ifall det inte är ett nummer så säger den till att fösöka om istället för att crasha 
					guessing = true;
					System.out.println("Det är inte ett tal, du måste gissa på ett tal!");
					input.nextLine();
				}
			}
			
			
			if ( detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 10  ){ // om man gissar ett nummer över 10 eller mindre än 1 så kommer det säga att det inte är ett giltigt giss
				System.out.println( detNummretPersonenSkriver + " Är inte ett giltligt giss, försök igen!");
			} else if (detNummretPersonenSkriver > Nummret) { // gissen är mindre än talet
				System.out.println("mitt tal är lägre, försök igen!");

			} else if (detNummretPersonenSkriver < Nummret) { // gissen är högre än talet
				System.out.println("mitt tal är högre, försök igen!");
			}  else {
				System.out.println("Rätt, det tog dig " + antal + " försök dock"); // när man gissar rätt
				System.out.println("vill du spela igen? i så fall skrev ja");

				String buffer = input.nextLine();// den skippar denna linejn för nån annledning
				String froga = input.nextLine();
				if (froga.equals("ja")) {
					antal = 0; // antal försök resetar 
					playing = true; // kör om spelet
				} else { // om man inte vill spela igen
					System.out.println("okej hejdå"); 
					break;
				}

			}
		}

	}

}