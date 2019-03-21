import java.util.ArrayList;
import java.util.Scanner;

public class upgft {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<String> namesInBuilding = new ArrayList<>();// vilka som ar inne och inte inne
		ArrayList<String> entryLog = new ArrayList<>();// vad som hander
		int times = i.nextInt();// hur manga ganger du vill kora
		i.nextLine(); // buffer

		for (int j = 1; j <= times; j++) {
			String choice = i.nextLine(); // du skriver entry och namnet eller exit och namnet
			if (choice.contains("entry")) {
				String nameOnly = choice.substring(6, (choice.length()));
				if (namesInBuilding.contains(nameOnly)) {// raknar bort dom 6 forsta bokstaverna
					entryLog.add(nameOnly + " entered (ANOMALY)");
				} else {
					namesInBuilding.add(nameOnly);
					entryLog.add(nameOnly + " entered");
				}
			} else if (choice.contains("exit")) { // hans ska ut
				String nameOnly = choice.substring(5, (choice.length()));// raknar bort dom 5 forsta
																						// bokstaverna alltsa exit och
																						// space
				if (namesInBuilding.contains(nameOnly)) {
					namesInBuilding.remove(nameOnly);
					entryLog.add(nameOnly + " exited");// han var inne och nu gick ut
				} else {
					entryLog.add(nameOnly + " exited (ANOMALY)");
				}
			}
		}
		
		for (String logItem : entryLog) {
			System.out.println(logItem);
		}

	}
}