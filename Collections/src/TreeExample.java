import java.util.*;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student("Ricardo","Ahuire","Perú", "001");
        Student st2=new Student("Mariah","Ashley","USA", "002");
        Student st3=new Student("Ryan","Danner","USA", "003");
        Student st5=new Student("Daniel","De Melo","Brazil", "005");
        Student st6=new Student("Arthur","Streeter","USA", "006");
        Student st7=new Student("Tyler","Tucker","USA", "007");
        Student st4=new Student("Marie","De Guzmán","Philippines", "004");
        
        
        Student compareStudents=new Student();
        
        TreeSet<Student> classmates = new TreeSet<Student>(compareStudents);
        
        classmates.add(st6);
        classmates.add(st2);
        classmates.add(st3);
        classmates.add(st4);
        classmates.add(st5);
        classmates.add(st1);
        classmates.add(st7);
        
        for(Student stu: classmates) {
        	System.out.println(stu.getLast_name());
        }
        
        // Check to see if the Tree is empty or not
    	if (classmates.isEmpty()) {
    		System.out.print("\nTree Set is empty.");
    	} else {
    		System.out.println("\nTree Set size: " + classmates.size());
    	}
    	
    	// Retrieve first data from tree set
    	System.out.println("\nFirst Student: " + classmates.first().getLast_name());
    	
    	// Retrieve last data from tree set
    	System.out.println("\nLast Student: " + classmates.last().getLast_name());
    	
    	// We will remove the data from the tree set. 
    	if (classmates.remove(st5)) { // remove element by value
    		System.out.println("\n" + st5.getLast_name() + " student is removed from tree set");
    	} else {
    		System.out.println("\nData doesn't exist!");
    	}
    	
    	if (classmates.isEmpty()) {
    		System.out.print("\nTree Set is empty.");
    	} else {
    		System.out.println("\nNow the tree set contain: " + classmates.size()+"\n");
    	}
    	
    	for(Student stu: classmates) {
        	System.out.println(stu.getLast_name());
        }
    	
    	// Remove all the data in the tree set.
    	classmates.clear();
    	if (classmates.isEmpty()) {
    		System.out.print("\nTree Set is empty.");
    	} else {
    		System.out.println("\nTree Set size: " + classmates.size());
    	}

	}     

}
