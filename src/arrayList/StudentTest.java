package arrayList;

import java.util.ArrayList;
public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(101,"Sonoo",23);  
		Student s2=new Student(102,"Ravi",21);  
		Student s3=new Student(103,"Hanumat",25);   
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1); 
		  al.add(s2);  
		  al.add(s3);
		  System.out.println("Before Updation:");
		  for(Student s:al)
		  {
			System.out.println(s.rollno+"\t"+s.name+"\t"+s.age);
		  }	
		  System.out.println("After Updation of record:");
		  for(Student st:al)
		  {
			  if(st.getName().equals("Sonoo"))
				{
					st.setRollno(100);
					st.setName("Yamuna");
					st.setAge(24); 
				}
				
				System.out.println(st.rollno+"\t"+st.name+"\t"+st.age);
		  }
		  System.out.println("after deletion of record:");
		  for(Student str:al)
		  {
			  if(str.getName().equals("Ravi"))
				{
					al.remove(s2);
				}
		  
		  }
		  for(Student std:al)
		  {
			System.out.println(std.rollno+"\t"+std.name+"\t"+std.age);
		  }	
	}
}