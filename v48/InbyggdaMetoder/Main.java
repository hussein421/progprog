package InbyggdaMetoder;

public class Main {

	public static void main(String[] args) {
		InbyggdaMetoder sc= new InbyggdaMetoder();
		
		
		System.out.println(sc.KlotVolym(10));
		sc.sjorovare("hejsan");
		System.out.println(sc.reverse("hejsan"));
		System.out.println(sc.count("hejsan", 'e'));
		
	}
	
}
