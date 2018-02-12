package set;
import java.util.*;
public class TreeSetExample {
			public static void main(String[] args) {  
			    Set<Price> set=new TreeSet<Price>();  
			    //Creating Books 
			    Price p1=new Price("Banana", 20,);
			    Price p2=new Price("Apple", 40,);
			    Price p3=new Price("Orange", 30,);
			    //Price p4=new Price("Banana", 20);
			    //Adding Books to TreeSet  
			    set.add(p1);  
			    set.add(p2);  
			    set.add(p3);  
			    //set.add(p4);
			    //Traversing TreeSet  
			    for(Price pr:set){  
			    System.out.println(pr.item+" "+pr.price);  
			    } 
			    System.out.println("after Updation:");
			    for(Price pi:set){  
			    	if(pi.getItem().equals("Apple"))
			    	{
			    		pi.setItem("Guava");
			    		pi.setPrice(50);
			    		pi.setDate("13/02/18");
			    	}
				    System.out.println(pi.item+" "+pi.price+" "+pi.Date);  
				    } 
			    System.out.println("After deletion:");
			    set.remove(p1);
			    for(Price pc:set){  
				    System.out.println(pc.item+" "+pc.price+" "+pc.Date);  
				    }  
	}
}
