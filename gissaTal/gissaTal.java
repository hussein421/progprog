import java.util.Scanner;

public class gissaTal {

	public static void main(String[] args) {
		boolean playing = true;
		int antal =0;
	Scanner input = new Scanner(System.in);	
	int a=0;
	
	while(playing) {
		
		if(antal==0) {
			a = (int)(Math.random()*10+1);
		System.out.println("gissa p� ett tal mellan 1-10");
		}antal++;//antal f�rs�k
	int b = input.nextInt(); // personens input
	if(b>a) {
		System.out.println("mitt tal �r l�gre, f�rs�k igen");
		
	}else if(b<a) {
			System.out.println("mitt tal �r h�gre, f�rs�k igen");	
		}
		else{ 
			System.out.println("R�tt, det tog dig " + antal +" f�rs�k dock");
			System.out.println("vill du spela igen? i s� fall skrev ja");

			String buffer = input.nextLine();
			String froga = input.nextLine();
			if(froga.equals("ja")){ 
				antal=0;
				playing = true;
				}else { System.out.println("okej hejd�");
				break;
				}
			
		}
	} 
	
	
	
	
	
	}
	}

