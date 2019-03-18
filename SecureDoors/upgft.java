import java.util.ArrayList;
import java.util.Scanner;

public class upgft {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<String> namesInBuilding = new ArrayList<>();// vilka som �r inne och inte inne
		ArrayList<String> entryLog = new ArrayList<>();//vad som h�nder
		boolean playing = true;
		int times = i.nextInt();// hur m�nga g�nger du vill k�ra
		i.nextLine(); // buffer

		while (playing) {
			for (int j = 1; j <= times; j++) {
				String choiceAndName = i.nextLine(); // du skriver entry och namnet eller exit och namnet
				if (choiceAndName.contains("entry")) {
					String nameOnly = choiceAndName.substring(6, (choiceAndName.length()));
						if (namesInBuilding.contains(nameOnly)) {// r�knar bort dom 6 f�rsta bokst�verna
						namesInBuilding.add(nameOnly);
						entryLog.add(nameOnly + " entered (anomaly)");
					} else {
						namesInBuilding.add(nameOnly);
						entryLog.add(nameOnly + " entered");
					}
				} else if (choiceAndName.contains("exit")) { // hans ska ut
					String nameOnly = choiceAndName.substring(5, (choiceAndName.length()));// r�knar bort dom 5 f�rsta bokst�verna allts� exit och space
					if (namesInBuilding.contains(nameOnly)) {
						namesInBuilding.remove(nameOnly); 
						entryLog.add(nameOnly + " exit");// han var inne och nu gick ut
					} else {
						 namesInBuilding.remove(nameOnly);
						entryLog.add(nameOnly + " exit (anomaly)");
					}
				}
			}
			playing = false;
			for(String logItem : entryLog) {
				System.out.println(logItem);
			}
		}
	}
}