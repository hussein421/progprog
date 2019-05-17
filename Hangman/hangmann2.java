import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm.WordListener;

public class hangmann2 {

	static boolean spelet;

	public static void main(String[] args) { // main metoden

		Scanner input = new Scanner(System.in); // så att den kan läsa charachtarer
		spelet = true; // så att jag kan starta om hela spelet

		while (spelet) {

			ArrayList<String> easy = new ArrayList<>();// orden man skall gissa på
			easy.add("samar");
			easy.add("samira");
			easy.add("maryam");
			easy.add("haiwan");
			easy.add("kelb");

			String sjalva_ordet_easy = easy.get((int) (Math.random() * 4)); // själva ordet personen skall gissa på
																			// slumpas fram

			ArrayList<String> medel = new ArrayList<>();// orden man skall gissa på
			medel.add("gta");
			medel.add("kaos");
			medel.add("shorba");
			medel.add("daxri");
			medel.add("khara");

			String sjalva_ordet_medel = medel.get((int) (Math.random() * 4)); // själva ordet personen skall gissa på
																				// slumpas fram

			ArrayList<String> hard = new ArrayList<>();// orden man skall gissa på
			hard.add("lebron");
			hard.add("giannis");
			hard.add("antetekompuo");
			hard.add("kostas");
			hard.add("manopolas");

			String sjalva_ordet_hard = hard.get((int) (Math.random() * 4)); // själva ordet personen skall gissa på
																			// slumpas fram

			int person = personer(input);// anropar metoden där perosnen kan välja om han ska köra singel eller
											// multiplayer

			switch (person) {
			case 1:

				multiplayer(input);
				break;
			case 2:
				int choice = meny(input);// anropar switch case

				switch (choice) {
				case 1:

					easy(sjalva_ordet_easy, input);// anropar metoden
					break;
				case 2:

					medel(sjalva_ordet_medel, input);// anropar metoden
					break;
				case 3:

					hard(sjalva_ordet_hard, input);// anropar metoden
					break;
				}
				break;
			}
		}

	}

	static public int personer(Scanner input) {

		int person = 0;
		boolean kolla = true;// startar om den ifall personen inte väljer 1 eller 2
		while (kolla) {

			try {
				System.out.println("Hej och välkomen till mitt hänga gubbe spel! ");
				System.out.println("Vill du spela Single player eller multiplayer?");
				System.out.println("(1) - multiplayer");
				System.out.println("(2) - single player");
				person = input.nextInt();

				kolla = false;
			} catch (InputMismatchException e) {

				String a = input.next();// buffert
				System.out.println("Kom igen, bete dig");
				kolla = true;
			}

			break;
		}
		return person;
	}

	static public int meny(Scanner input) {// switch case för svårhetsgrad
		int choice = 0;
		boolean kolla = true;
		while (kolla) {
			try {
				System.out.println("Vilken svårhetsgrad vill du spela på?");
				System.out.println("(1) - lätt?");
				System.out.println("(2) - medel?");
				System.out.println("(3) - svårt?");

				choice = input.nextInt();
				if (choice > 3 || choice < 1) {
					System.out.println("Kom igen, bete dig!!");
					continue;
				}
				kolla = false;
			} catch (InputMismatchException e) {

				String a = input.next();// buffert
				System.out.println("Kom igen, bete dig!!");
				kolla = true;
			}

		}
		return choice;
	}

	static public void multiplayer(Scanner input) {
		System.out.println("skriv ner ordet du vill att din partner skall gissa på!");
		String buffert2 = input.nextLine();
		String sjalva_ordet = input.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int antal_forsok = 0;

		char[] gissa_ordet = new char[sjalva_ordet.length()];
		int i = 0;
		while (i < sjalva_ordet.length()) { // omvandlar ordet till ---
			gissa_ordet[i] = '-';
			if (sjalva_ordet.charAt(i) == (' ')) {
				gissa_ordet[i] = ' ';
			}
			i++;
		}
		boolean kolla = true;
		int liv = 0;
		while (kolla) {
			try {
				System.out.println("Skriv antal försök du vill att din partner ska ha!");

				liv = input.nextInt();
				kolla = false;
			} catch (InputMismatchException e) {
				String a = input.next();
				System.out.println("Kom igen, bete dig!!");
				kolla = true;
			}
		}

		System.out.println("Din partner valde att du har " + liv + " liv");
		System.out.print("Det här är ordet du ska gissa på:    ");
		System.out.println(gissa_ordet);

		ArrayList<Character> log = new ArrayList<>(); // charactarerna personen gissar på sparas här
		boolean won = false;

		while (liv > 0 && !won) {
			String bokstaver = input.next(); // personen gissar

			if (bokstaver.length() == 1) {
				char bokstav = bokstaver.charAt(0);// om personen gissar på en bokstav så omvandlas den till en char

				if (log.contains(bokstav)) { // om man gissar på samma sak mer än en gång

					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");

					continue; // while loopen forsätter
				}

				log.add(bokstav);

				if (sjalva_ordet.contains(bokstav + "")) { // kollar om personer gissar rätt och byter - med bokstaven
					antal_forsok++;
					for (int x = 0; x < gissa_ordet.length; x++) {
						if (sjalva_ordet.charAt(x) == (bokstav)) {
							gissa_ordet[x] = bokstav;
						}
					}
				} else {
					antal_forsok++;
					liv--;
				}
				System.out.print(gissa_ordet);
				System.out.println("          Du har " + liv + " liv kvar");
				System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			}

			else {
				if (sjalva_ordet.equals(bokstaver.toLowerCase())) {// om personen gissar rätt på hela ordet
					antal_forsok++;
					System.out.println(sjalva_ordet);
					System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
					System.out.println("vill du spela igen?");
					won = true;
					System.out.println("(1) - ja ");

					System.out.println("(2) - nej ");

					String buffert = input.nextLine();// den hoppar över denna för nån anledning

					String svar = input.nextLine();

					if (svar.equals("1")) {
						spelet = true;
						log.clear();

					} else {
						System.out.println("okej hejdå");
						spelet = false;
						break;
					}
				}
				if (!sjalva_ordet.equals(bokstaver.toLowerCase())) {// om man gissar fel på hela ordet
					antal_forsok++;
					liv--;
					System.out.println("fel, gissa igen!");
					System.out.print(gissa_ordet);
					System.out.println("          Du har " + liv + " liv kvar");
					System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			

				}
			}

			if (sjalva_ordet.equals(String.valueOf(gissa_ordet))) { // ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet);
				System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
				System.out.println("vill du spela igen?");
				won = true;
				System.out.println("(1) - ja ");

				System.out.println("(2) - nej ");

				String buffert = input.nextLine();// den hoppar över denna för nån anledning

				String svar = input.nextLine();

				if (svar.equals("1")) {
					spelet = true;
					log.clear();

				} else {
					System.out.println("okej hejdå");
					spelet = false;
					break;
				}

			}

		}
		if (liv == 0) { // om du förlorar
			System.out.println("Du förlora och ordet var: " + sjalva_ordet);

			System.out.println("vill du spela igen?");

			System.out.println("(1) - ja ");

			System.out.println("(2) - nej ");

			String buffert = input.nextLine(); // den hoppar över denna för nån anledning

			String svar = input.nextLine();

			if (svar.equals("1")) { // om man vill spela igen
				spelet = true;
				log.clear();
			} else { // om inte
				System.out.println("okej hejdå");
				spelet = false;
			}
		}
	}

	static public void easy(String sjalva_ordet_easy, Scanner input) {// hela själva metoden
		char[] gissa_ordet = new char[sjalva_ordet_easy.length()];
		int i = 0;
		int antal_forsok = 0;
		int liv = 15;
		while (i < sjalva_ordet_easy.length()) { // omvandlar ordet till ---
			gissa_ordet[i] = '-';
			if (sjalva_ordet_easy.charAt(i) == (' ')) {
				gissa_ordet[i] = ' ';
			}
			i++;
		}

		System.out.println("du har " + liv + " liv");
		System.out.print("Det här är ordet du ska gissa på:    ");
		System.out.println(gissa_ordet);

		ArrayList<Character> log = new ArrayList<>(); // charactarerna personen gissar på sparas här
		boolean won = false;

		while (liv > 0 && !won) {
			String bokstaver = input.next(); // personen gissar bokstäver

			if (bokstaver.length() == 1) {
				char bokstav = bokstaver.charAt(0);

				if (log.contains(bokstav)) { // om man gissar på samma sak mer än en gång

					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");

					continue; // while loopen forsätter
				}

				log.add(bokstav);

				if (sjalva_ordet_easy.contains(bokstav + "")) { // kollar om personer gissar rätt och byter - med
																// bokstaven
					antal_forsok++;
					for (int x = 0; x < gissa_ordet.length; x++) {
						if (sjalva_ordet_easy.charAt(x) == (bokstav)) {
							gissa_ordet[x] = bokstav;
						}
					}
				} else {
					antal_forsok++;
					liv--;
				}
				System.out.print(gissa_ordet);
				System.out.println("          Du har " + liv + " liv kvar");
				System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på

			} else {
				if (sjalva_ordet_easy.equals(bokstaver)) {
					antal_forsok++;
					System.out.println(sjalva_ordet_easy);
					System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
					System.out.println("vill du spela igen?");

					System.out.println("(1) - ja ");

					System.out.println("(2) - nej ");

					String buffert = input.nextLine();// den hoppar över denna för nån anledning

					String svar = input.nextLine();

					if (svar.equals("1")) {
						spelet = true;
						log.clear();
						won = true;
					} else {
						System.out.println("okej hejdå");
						spelet = false;
						break;
					}
				}
				if (!sjalva_ordet_easy.equals(bokstaver.toLowerCase())) {// om man gissar fel på hela ordet
					antal_forsok++;
					liv--;
					System.out.println("fel, gissa igen!");
					System.out.print(gissa_ordet);
					System.out.println("          Du har " + liv + " liv kvar");
					System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			

				}
			}

			if (sjalva_ordet_easy.equals(String.valueOf(gissa_ordet))) { // ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_easy);
				System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
				System.out.println("vill du spela igen?");

				System.out.println("(1) - ja ");

				System.out.println("(2) - nej ");

				String buffert = input.nextLine();// den hoppar över denna för nån anledning

				String svar = input.nextLine();

				if (svar.equals("1")) {
					spelet = true;
					log.clear();
					won = true;
				} else {
					System.out.println("okej hejdå");
					spelet = false;
					break;
				}

			}

		}
		if (liv == 0) { // om du förlorar
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_easy);

			System.out.println("vill du spela igen?");

			System.out.println("(1) - ja ");

			System.out.println("(2) - nej ");

			String buffert = input.nextLine(); // den hoppar över denna för nån anledning

			String svar = input.nextLine();

			if (svar.equals("1")) { // om man vill spela igen
				spelet = true;
				log.clear();
			} else { // om inte
				System.out.println("okej hejdå");

				spelet = false;
			}
		}
	}

	static public void hard(String sjalva_ordet_hard, Scanner input) {// hela själva metoden
		char[] gissa_ordet = new char[sjalva_ordet_hard.length()];
		int liv = 5;
		int antal_forsok = 0;
		int i = 0;
		while (i < sjalva_ordet_hard.length()) { // omvandlar ordet till ---
			gissa_ordet[i] = '-';
			if (sjalva_ordet_hard.charAt(i) == (' ')) {
				gissa_ordet[i] = ' ';
			}
			i++;
		}

		System.out.println("du har " + liv + " liv");
		System.out.print("Det här är ordet du ska gissa på:    ");
		System.out.println(gissa_ordet);

		ArrayList<Character> log = new ArrayList<>(); // charactarerna personen gissar på sparas här
		boolean won = false;

		while (liv > 0 && !won) {
			String bokstaver = input.next(); // personen gissar

			if (bokstaver.length() == 1) { // ifall det är en bokstav då omvandlas den till en char
				char bokstav = bokstaver.charAt(0);
				if (log.contains(bokstav)) { // om man gissar på samma sak mer än en gång

					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");

					continue; // while loopen forsätter
				}

				log.add(bokstav);

				if (sjalva_ordet_hard.contains(bokstav + "")) { // kollar om personer gissar rätt och byter - med
																// bokstaven
					antal_forsok++;
					for (int x = 0; x < gissa_ordet.length; x++) {
						if (sjalva_ordet_hard.charAt(x) == (bokstav)) {
							gissa_ordet[x] = bokstav;
						}
					}
				} else {
					antal_forsok++;
					liv--;
				}
				System.out.print(gissa_ordet);
				System.out.println("          Du har " + liv + " liv kvar");
				System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på

			} else {
				if (sjalva_ordet_hard.equals(bokstaver)) {
					antal_forsok++;
					System.out.println(sjalva_ordet_hard);
					System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
					System.out.println("vill du spela igen?");

					System.out.println("(1) - ja ");

					System.out.println("(2) - nej ");

					String buffert = input.nextLine();// den hoppar över denna för nån anledning

					String svar = input.nextLine();

					if (svar.equals("1")) {
						spelet = true;
						log.clear();
						won = true;
					} else {
						System.out.println("okej hejdå");
						spelet = false;
						break;
					}
				}
				if (!sjalva_ordet_hard.equals(bokstaver.toLowerCase())) {// om man gissar fel på hela ordet
					antal_forsok++;
					liv--;
					System.out.println("fel, gissa igen!");
					System.out.print(gissa_ordet);
					System.out.println("          Du har " + liv + " liv kvar");
					System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			

				}
				
			}
			if (sjalva_ordet_hard.equals(String.valueOf(gissa_ordet))) { // ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_hard);
				System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
				System.out.println("vill du spela igen?");

				System.out.println("(1) - ja ");

				System.out.println("(2) - nej ");

				String buffert3 = input.nextLine();// den hoppar över denna för nån anledning

				String svar = input.nextLine();

				if (svar.equals("1")) { // om man vill spela igen
					spelet = true;
					log.clear();
					won = true;
				} else { // om inte
					System.out.println("okej hejdå");
					spelet = false;
					break;
				}

			}

		}
		if (liv == 0) {
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_hard);

			System.out.println("vill du spela igen?");

			System.out.println("(1) - ja ");

			System.out.println("(2) - nej ");

			String buffert = input.nextLine(); // den hoppar över denna för nån anledning

			String svar = input.nextLine();

			if (svar.equals("1")) { // om man vill spela igen
				spelet = true;
				log.clear();
			} else { // om inte
				System.out.println("okej hejdå");
				spelet = false;

			}
		}
	}

	static public void medel(String sjalva_ordet_medel, Scanner input) {// hela själva metoden
		char[] gissa_ordet = new char[sjalva_ordet_medel.length()];
		int i = 0;
		int antal_forsok = 0;
		int liv = 10;
		while (i < sjalva_ordet_medel.length()) { // omvandlar ordet till ---
			gissa_ordet[i] = '-';
			if (sjalva_ordet_medel.charAt(i) == (' ')) {
				gissa_ordet[i] = ' ';
			}
			i++;
		}

		System.out.println("du har " + liv + " liv");
		System.out.print("Det här är ordet du ska gissa på:    ");
		System.out.println(gissa_ordet);

		ArrayList<Character> log = new ArrayList<>(); // charactarerna personen gissar på sparas här
		boolean won = false;

		while (liv > 0 && !won) {

			String bokstaver = input.next(); // personen gissar bokstäver

			if (bokstaver.length() == 1) {
				char bokstav = bokstaver.charAt(0);

				if (log.contains(bokstav)) { // om man gissar på samma sak mer än en gång

					System.out.println("bokstaven har du redan gissat på, gissa på en annan bokstav!");

					continue; // while loopen forsätter
				}

				log.add(bokstav);

				if (sjalva_ordet_medel.contains(bokstav + "")) { // kollar om personer gissar rätt och byter - med
																	// bokstaven
					antal_forsok++;
					for (int x = 0; x < gissa_ordet.length; x++) {
						if (sjalva_ordet_medel.charAt(x) == (bokstav)) {
							gissa_ordet[x] = bokstav;
						}
					}
				} else {
					antal_forsok++;
					liv--;
				}
				System.out.print(gissa_ordet);
				System.out.println("          Du har " + liv + " liv kvar");
				System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			} else {
				if (sjalva_ordet_medel.equals(bokstaver)) {
					antal_forsok++;
					System.out.println(sjalva_ordet_medel);
					System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
					System.out.println("vill du spela igen?");

					System.out.println("(1) - ja ");

					System.out.println("(2) - nej ");

					String buffert = input.nextLine();// den hoppar över denna för nån anledning

					String svar = input.nextLine();

					if (svar.equals("1")) {
						spelet = true;
						log.clear();
						won = true;
					} else {
						System.out.println("okej hejdå");
						spelet = false;
						break;
					}
				}
				if (!sjalva_ordet_medel.equals(bokstaver.toLowerCase())) {// om man gissar fel på hela ordet
					antal_forsok++;
					liv--;
					System.out.println("fel, gissa igen!");
					System.out.print(gissa_ordet);
					System.out.println("          Du har " + liv + " liv kvar");
					System.out.println("Du har gissat på:" + Arrays.asList(log));// visar vad du har redan gissat på
			

				}
			}
			if (sjalva_ordet_medel.equals(String.valueOf(gissa_ordet))) { // ifall persone gissar rätt på hela ordet
				System.out.println(sjalva_ordet_medel);
				System.out.println("Du klara det!! Det tog dig " + antal_forsok + " försök!");
				System.out.println("vill du spela igen?");

				System.out.println("(1) - ja ");

				System.out.println("(2) - nej ");

				String buffert = input.nextLine();// den hoppar över denna för nån anledning

				String svar = input.nextLine();

				if (svar.equals("1")) { // om man vill spela igen
					spelet = true;
					log.clear();
				} else { // om inte
					System.out.println("okej hejdå");
					spelet = false;
					break;
				}

			}

		}
		if (liv == 0) {
			System.out.println("Du förlora och ordet var: " + sjalva_ordet_medel);

			System.out.println("vill du spela igen?");

			System.out.println("(1) - ja ");

			System.out.println("(2) - nej ");

			String buffert2 = input.nextLine(); // den hoppar över denna för nån anledning

			String svar = input.nextLine();

			if (svar.equals("1")) { // om personen vill spela igen
				spelet = true;
				log.clear();

			} else { // om inte
				System.out.println("okej hejdå");
				spelet = false;

			}
		}
	}

}
