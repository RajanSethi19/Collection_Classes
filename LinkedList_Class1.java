package Collection_Classes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();

		l1.add("Rajan");
		l1.add("Sethi");
		l1.add("Akhila");
		l1.add("Yayu");
		l1.add("Anitha");
		l1.add("RIA");
		/*
		 * l1.add('a'); l1.add(null); l1.add(null); l1.add(null); l1.add(10);
		 */
		System.out.println(l1);

		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());

		/*
		 * Iterator i1= l1.iterator(); while(i1.hasNext()) {
		 * System.out.println(i1.next()); }
		 * System.out.println("Now using list iterator farward traversing");
		 * ListIterator i2= l1.listIterator(); while(i2.hasNext()) {
		 * System.out.println(i2.next());
		 * 
		 * } System.out.println("Now using list iterator backward traversing");
		 * while(i2.hasPrevious()) { System.out.println(i2.previous());
		 * 
		 * }
		 */

		/*
		 * l1.addFirst("Vidya"); l1.addLast("Abhilash"); System.out.println(l1);
		 * 
		 * l1.removeFirst(); System.out.println(l1); //Collections.sort(l1);
		 * System.out.println(l1); l1.removeLast(); System.out.println(l1);
		 */

	}

}
