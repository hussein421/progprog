import java.util.ArrayList;
import java.util.Scanner;

public class upgft {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<String> secureDoors = new ArrayList<>();
		boolean playing = true;
		int times = i.nextInt();// hur m�nga g�nger du vill k�ra
		i.nextLine(); // buffer

		while (playing) {
			for (int j = 1; j <= times; j++) {
				String choiceAndName = i.nextLine(); // du skriver entry och namnet eller exit och namnet
				if (choiceAndName.contains("entry")) {
					String nameOnly = choiceAndName.substring(6, (choiceAndName.length()));
						if (secureDoors.contains(nameOnly)) {// r�knar bort dom 5 f�rsta bokst�verna
						secureDoors.add(nameOnly + " entered (anomaly)");
					} else {
						secureDoors.add(nameOnly + " entered");
					}
				} else if (choiceAndName.contains("exit")) { // hans ska ut
					String nameOnly = choiceAndName.substring(5, (choiceAndName.length()));
					if (secureDoors.contains(nameOnly)) {
						secureDoors.add(nameOnly + " exit");// han var inne och nu gick ut
					} else {
						secureDoors.add(nameOnly + " exit (anomaly)");
					}
				}
			}
			playing = false;
			System.out.println(secureDoors);
		}
	}
}