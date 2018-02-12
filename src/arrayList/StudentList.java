package arrayList;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Ajay");
		str.add("Vijay");
		str.add("Hari");
		str.add("Narendra");
		str.add("Gopi");
		str.add("Ajay");
		ArrayList<String> sr=new ArrayList<String>();
		sr.add("Sai");
		sr.add("Vijay");
		str.addAll(sr);
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
