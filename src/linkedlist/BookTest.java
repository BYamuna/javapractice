package linkedlist;

import java.util.LinkedList;

public class BookTest {
	public static void main(String[] args) {  
	    //Creating list of Books  
	    LinkedList<Book> list=new LinkedList<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Book b:list){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    } 
	    System.out.println("After Updation:");
	    for(Book b:list)
	    {
	    	if(b.getId()==103)
	    	{
	    		b.setId(104);
	    		b.setName("ComputerNetworks");
	    		b.setAuthor(" Andrew S. Tanenbaum");
	    		b.setPublisher("Pearson Education");
	    		b.setQuantity(2);
	    	}
	    	System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.quantity);
	    }
	    System.out.println("After deletion:");
	    for(Book bk:list)
		{
			if(bk.getId()==101||bk.getId()==102)
			{
				list.remove(b1);
				list.remove(b2);
				//list.clear();
			}
	    	if(bk.getId()==102)
	    		list.remove(b2);
		}
	    for(Book bs:list)
	    {
	    	System.out.println(bs.id+"\t"+bs.name+"\t"+bs.author+"\t"+bs.publisher+"\t"+bs.quantity);	
	    }
	}
	
}
