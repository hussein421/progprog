package InbyggdaMetoder;

import java.util.Scanner;

public class InbyggdaMetoder {

	static double KlotVolym(double r) {
		double volym = 4 * Math.PI * Math.pow(r, 3);
		return volym;
	}

	static String reverse(String str) {
		String reverse = "";
		for (char i : str.toCharArray()) {
			reverse = i + reverse;
		}
		return reverse;
	}

	static int count(String str, char c) {
		int count = 0;
		for (char i : str.toCharArray()) {
			if (i == c) {
				count++;
			}
		}
		return count;
	}

	static void sjorovare(String str) {
		String vokaler = "aouöeiyäå";

		for (int s = 0; s < str.length(); s++) {

			char bokstav = str.charAt(s);
			boolean isVokal = false;
			for (int vok = 0; vok < vokaler.length(); vok++) {
				char vokal = vokaler.charAt(vok);
				if (bokstav == vokal) {
					isVokal = true;
				}
			}

			if (isVokal) {
				System.out.print(bokstav);
				
			} else {
				System.out.print(bokstav + "o" + bokstav);
			}
		}
	}
	
	
}
