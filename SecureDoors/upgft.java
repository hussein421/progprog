import java.util.ArrayList;
import java.util.Scanner;

public class upgft {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<String> namesInBuilding = new ArrayList<>();// vilka som är inne och inte inne
		ArrayList<String> entryLog = new ArrayList<>();//vad som händer
		boolean playing = true;
		int times = i.nextInt();// hur många gånger du vill köra
		i.nextLine(); // buffer

		while (playing) {
			for (int j = 1; j <= times; j++) {
				String choiceAndName = i.nextLine(); // du skriver entry och namnet eller exit och namnet
				if (choiceAndName.contains("entry")) {
					String nameOnly = choiceAndName.substring(6, (choiceAndName.length()));
						if (namesInBuilding.contains(nameOnly)) {// räknar bort dom 6 första bokstäverna
						namesInBuilding.add(nameOnly);
						entryLog.add(nameOnly + " entered (anomaly)");
					} else {
						namesInBuilding.add(nameOnly);
						entryLog.add(nameOnly + " entered");
					}
				} else if (choiceAndName.contains("exit")) { // hans ska ut
					String nameOnly = choiceAndName.substring(5, (choiceAndName.length()));// räknar bort dom 5 första bokstäverna alltså exit och space
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