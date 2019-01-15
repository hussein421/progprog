
public class arrayMetoder {
	static int upg1(int[] numbers) {
		int COUNTER=0;
		for (int x = 0; x < numbers.length; x++) {
	  
			if(numbers[x] == 7) {
				COUNTER++;
	 }
 }
 return COUNTER;
	}
	static int upg2(String[] names) {
		int counter=0;
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				counter++;
			}
		}
		return counter;
	}
	/*static int upg3(int[] numbers) {
										
	}
	return cpnr;*/
	static int upg4(String[] names){
		int index=0;
		for (int i = 0; i < names.length; i++) {
			
			if(names[i].equals("Drusilla")) {
				
				index = i;	
			}
			
		}
		return index;
	}
	static int upg5(int[] numbers) {
		int counter=0;
		for (int i = 0; i < numbers.length; i++) {
			if(i%2==0) {
				counter = counter +i;
			}
		}
		
		
		return counter;
	}
	static int upg6(String[] names) {
		char a=4;
		int counter=0;
		for (int i = 0; i < names.length; i++) {
			if(i == a) {
				counter++;
			}
		}
		
		
		
		return counter;
	}
	}
	
	
	  
