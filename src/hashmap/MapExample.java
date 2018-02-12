package hashmap;
import java.util.*;
class Book 
{    
int id;    
String name,author,publisher;    
int quantity;    
	public Book(int id, String name, String author, String publisher, int quantity) 
	{    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	} 
	
}
public class MapExample 
{
	public static void main(String[] args) 
	{    
	    //Creating map of Books    
	    Map<Integer,Book> map=new HashMap<Integer,Book>();    
	    //Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);     
	    //Traversing map  
	    for(Map.Entry<Integer, Book> entry:map.entrySet())
	    {    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }
	    System.out.println("After Updation:");
	    for(Map.Entry<Integer, Book> entry:map.entrySet())
	    {    
	        int ky=entry.getKey();  
	        Book bk=entry.getValue();  
	         if(bk.getId()==101)
	         {
	        	 bk.setId(100);
	        	 bk.setName("ComputerNetworks");
	        	 bk.setAuthor(" Andrew S.Tanenbaum");
	        	 bk.setPublisher("Pearson Education");
	        	 bk.setQuantity(2);
	         }
	         System.out.println(ky+" Details:");  
		     System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);
	    }
	    System.out.println("After Deletion:");
	    map.remove(2);
	    for(Map.Entry<Integer, Book> entry:map.entrySet())
	    {    
	        int ke=entry.getKey();  
	        Book bo=entry.getValue();  
	        System.out.println(ke+" Details:");  
	        System.out.println(bo.id+" "+bo.name+" "+bo.author+" "+bo.publisher+" "+bo.quantity);   
	    }
	}     	
}	
