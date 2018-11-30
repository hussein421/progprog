import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		Scanner skriv=new Scanner(System.in);
		double nr=0.1;
		double summa=0;
		while(nr!=0) {
			System.out.println("skriv in nummer");
			nr=skriv.nextInt();
			summa += nr ;
			
		
		}
		System.out.println("din summa är "+ summa);

	}

}
