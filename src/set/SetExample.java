package set;
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
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
	result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
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
public class SetExample {

	public static void main(String[] args) {
		Set<Book> set=new HashSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    Book b4=new Book(103,"Operating System","Galvin","Wiley",6);
	    //Adding Books to Set  
	    
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3); 
	    set.add(b4);//because it doesn't allow duplicates.
	    //Traversing Set  
	    for(Book b:set){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    System.out.println("After Updation:");
	    for(Book bk:set){ 
	    	if(bk.getId()==102)
	    	{
	    		bk.setId(105);
	    		bk.setName("DBMS");
	    		bk.setAuthor("Shamkant B. Navathe");
	    		bk.setPublisher("Pearson Education");
	    		bk.setQuantity(10);
	    	}
		    System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);  
		    }
	    System.out.println("After deletion:");
	    //Book bo=new Book(103,"Operating System","Galvin","Wiley",6);
	    set.remove(b3);
	    for(Book bl:set)
	    {
	    	System.out.println(bl.id+" "+bl.name+" "+bl.author+" "+bl.publisher+" "+bl.quantity); 
	    }
	}

}
