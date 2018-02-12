package arrayList;

import java.util.*;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		System.out.println("After adding elements into the ArrayList:");
		System.out.println(al);
		System.out.println("After reading the elements from the ArrayList:");
		for(int li=0;li<al.size();li++)
		{
			System.out.println(al.get(li));
		}
		al.set(1, 5);
		System.out.println("After updating the element in the ArrayList:");
		System.out.println(al);
		al.remove(2);
		System.out.println("After deleting the element in the ArrayList:");
		System.out.println(al);	
	}
}