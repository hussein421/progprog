import java.util.ArrayList;

public class arrayList {
		public static void main(String[] args) {
			int[] jonny = {0,1,2,3,4,5};
		String[] hussein = {"sug ","husseins "};
		
		for (int i = 0; i < hussein.length; i++) {
			System.out.print(hussein[i]);
		}
		ArrayList<String> nameList= new ArrayList<>();
		nameList.add("maryam ");// lägger till hussein på index 0 första plats för man börjar på 0;
		nameList.add("samira,reza ");
		nameList.add("o adrian");
		nameList.add(0, "daxri ");// remove och set
		nameList.remove(nameList.get(1));// tar bort plats ett
		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i));
			
		}
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			alist.add(new Integer(i*i));
			
			}
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i).intValue());
		}
		}

}
