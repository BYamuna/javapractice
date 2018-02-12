package arrayList;

import java.util.ArrayList;

public class StrList {

	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList<String>();
			st.add("Sony");
			st.add("Aswini");
			st.add("Neela");
			st.add("Sabitha");
			st.add("Likitha");
			st.add("Surabhi");
			System.out.println("After adding elements into the ArrayList:");
			System.out.println(st);
			st.set(2, "laxmi");
			System.out.println("After Updating the element in the ArrayList:");
			System.out.println(st);
			System.out.println("After reading the elements from the ArrayList:");
			for(String i:st){
				System.out.println(i);
			}
			System.out.println("After deleting the element in the ArrayList:");
			st.remove("Surabhi");
			st.remove("Sabitha");
			st.remove("Sony");
			System.out.println(st);		
	}
}
