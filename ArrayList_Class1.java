package Collection_Classes;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Class1 {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add("Rajan");
		a1.add("Sethi");
		a1.add("RAHUL");
		a1.add("RIA");
		a1.add("manish");

		System.out.println(a1);
		
		int indexofmanish=	a1.indexOf("manish");
		System.out.println(indexofmanish);
		
		System.out.println(a1.get(2));
		
			a1.set(1, "Raj");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		
		
		 
		 
		
		
		
		

	}

}
