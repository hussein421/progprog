import java.util.InputMismatchException;
import java.util.Scanner;

public class gissaTal {

	public static void main(String[] args) {
		boolean playing = true;
		int antal = 0;// antal gissingar
		Scanner input = new Scanner(System.in);
		int Nummret = 0;
		int choice = 0;
		int detNummretPersonenSkriver = 0;

		choice = meny(input);
		
		while (playing) {

			switch (choice) {
			case 1:

				if (antal == 0) {// den börjar om antal gissningar är 0
					Nummret = (int) (Math.random() * 10 + 1);// gissning numret
					System.out.println("gissa på ett tal mellan 1-10");
				}
				antal++;// antal gissningar går upp varje gång
				boolean guessing = true;
				while (guessing) {
					try {
						detNummretPersonenSkriver = input.nextInt(); // personens input
						guessing = false;
					} catch (InputMismatchException e) { // ifall det inte är ett nummer så säger den till att fösöka om
															// istället för att crasha
						guessing = true;
						System.out.println("Det är inte ett tal, du måste gissa på ett tal!");
						input.nextLine();
					}
				}

				if (detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 10) { // om man gissar ett nummer över
																						// 10 eller mindre än 1 så
																						// kommer det säga att det inte
																						// är ett giltigt giss
					System.out.println(detNummretPersonenSkriver + " Är inte ett giltligt giss, försök igen!");
				} else if (detNummretPersonenSkriver > Nummret) { // gissen är mindre än talet
					System.out.println("mitt tal är lägre, försök igen!");

				} else if (detNummretPersonenSkriver < Nummret) { // gissen är högre än talet
					System.out.println("mitt tal är högre, försök igen!");
				} else {
					System.out.println("Rätt, det tog dig " + antal + " försök dock"); // när man gissar rätt
					System.out.println("vill du spela igen? i så fall skrev ja");

					String buffer = input.nextLine();// den skippar denna linejn för nån annledning
					String froga = input.nextLine();
					if (froga.equals("ja")) {
						choice = meny(input);
						antal = 0; // antal försök resetar
						playing = true; // kör om spelet
					} else { // om man inte vill spela igen
						System.out.println("okej hejdå");
						break;
					}

				}
				break;
			case 2:
				if (antal == 0) {// den börjar om antal gissningar är 0
					Nummret = (int) (Math.random() * 100 + 1);// gissning numret
					System.out.println("gissa på ett tal mellan 1-100");
				}
				antal++;// antal gissningar går upp varje gång
				guessing = true;
				while (guessing) {
					try {
						detNummretPersonenSkriver = input.nextInt(); // personens input
						guessing = false;
					} catch (InputMismatchException e) { // ifall det inte är ett nummer så säger den till att fösöka om
															// istället för att crasha
						guessing = true;
						System.out.println("Det är inte ett tal, du måste gissa på ett tal!");
						input.nextLine();
					}
				}

				if (detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 100) { // om man gissar ett nummer över
																						// 10 eller mindre än 1 så
																						// kommer det säga att det inte
																						// är ett giltigt giss
					System.out.println(detNummretPersonenSkriver + " Är inte ett giltligt giss, försök igen!");
				} else if (detNummretPersonenSkriver > Nummret) { // gissen är mindre än talet
					System.out.println("mitt tal är lägre, försök igen!");

				} else if (detNummretPersonenSkriver < Nummret) { // gissen är högre än talet
					System.out.println("mitt tal är högre, försök igen!");
				} else {
					System.out.println("Rätt, det tog dig " + antal + " försök dock"); // när man gissar rätt
					System.out.println("vill du spela igen? i så fall skrev ja");

					String buffer = input.nextLine();// den skippar denna linejn för nån annledning
					String froga = input.nextLine();
					if (froga.equals("ja")) {
						choice = meny(input);
						antal = 0; // antal försök resetar
						playing = true; // kör om spelet
					} else { // om man inte vill spela igen
						System.out.println("okej hejdå");
						break;
					}

				}

				break;

			case 3:
				if (antal == 0) {// den börjar om antal gissningar är 0
					Nummret = (int) (Math.random() * 500 + 1);// gissning numret
					System.out.println("gissa på ett tal mellan 1-500");
				}
				antal++;// antal gissningar går upp varje gång
				guessing = true;
				while (guessing) {
					try {
						detNummretPersonenSkriver = input.nextInt(); // personens input
						guessing = false;
					} catch (InputMismatchException e) { // ifall det inte är ett nummer så säger den till att fösöka om
															// istället för att crasha
						guessing = true;
						System.out.println("Det är inte ett tal, du måste gissa på ett tal!");
						input.nextLine();
					}
				}

				if (detNummretPersonenSkriver < 1 || detNummretPersonenSkriver > 500) { // om man gissar ett nummer över
																						// 10 eller mindre än 1 så
																						// kommer det säga att det inte
																						// är ett giltigt giss
					System.out.println(detNummretPersonenSkriver + " Är inte ett giltligt giss, försök igen!");
				} else if (detNummretPersonenSkriver > Nummret) { // gissen är mindre än talet
					System.out.println("mitt tal är lägre, försök igen!");

				} else if (detNummretPersonenSkriver < Nummret) { // gissen är högre än talet
					System.out.println("mitt tal är högre, försök igen!");
				} else {
					System.out.println("Rätt, det tog dig " + antal + " försök dock"); // när man gissar rätt
					System.out.println("vill du spela igen? i så fall skrev ja");

					String buffer = input.nextLine();// den skippar denna linejn för nån annledning
					String froga = input.nextLine();
					if (froga.equals("ja")) {
						choice = meny(input);
						antal = 0; // antal försök resetar
						playing = true; // kör om spelet
					} else { // om man inte vill spela igen
						System.out.println("okej hejdå");
						break;
					}
				}
				break;
			case 4:
				System.out.println("hejdå");
				playing = false;
				break;
			}

		}

	}

	static int meny(Scanner input) {

		System.out.println("Välkomen till mitt spel! välj ett av följande!");
		System.out.println("(1) - tal mellan 1-10");
		System.out.println("(2) - tal mellan 1-100");
		System.out.println("(3) - tal mellan 1-500");
		System.out.println("(4) - Quit");
		System.out.println();

		int choice = input.nextInt();

		return choice;
	}

}
