import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student("Ricardo","Ahuire","Perú", "001");
        Student st2=new Student("Mariah","Ashley","USA", "002");
        Student st3=new Student("Ryan","Danner","USA", "003");
        Student st4=new Student("Marie","De Guzmán","Philippines", "004");
        Student st5=new Student("Daniel","De Melo","Brazil", "005");
        Student st6=new Student("Arthur","Streeter","USA", "006");
        Student st7=new Student("Tyler","Tucker","USA", "007");
        
        List<Student> classmates = new ArrayList<Student>();

        classmates.add(st1);
        classmates.add(st2);
        classmates.add(st3);
        classmates.add(st4);
        classmates.add(st5);
        classmates.add(st6);
        classmates.add(st7);
        
        // Print the elements of the Set
	    System.out.println("List Objects: " + classmates + "\n");

        System.out.println("The members in my group are:");

        for (Student classmate : classmates) {
           System.out.println(classmate.getName() + " " + classmate.getLast_name() + " of " + classmate.getCountry());
        }
        
        Student st8=new Student("Maribel","Flores","Perú", "008");
        
        // We modify the list and placing it an a specific index,, we can see the new place of the objects.
        classmates.add(1, st8);
        
        System.out.println("\nList Objects: " + classmates + "\n");
	    
	    for (Student classmate : classmates) {
	           System.out.println(classmate.getName() + " " + classmate.getLast_name() + " of " + classmate.getCountry());
	    }
	    
	  //Modify the list using set method. This will replace what is already in the index.
	    classmates.set(2, st1);
	    
	    System.out.println("\nList Objects: " + classmates + "\n");
	    
	    for (Student classmate : classmates) {
	           System.out.println(classmate.getName() + " " + classmate.getLast_name() + " of " + classmate.getCountry());
	    }
	    
	    //Remove an element in the list
	    classmates.remove(2);
	    
	    System.out.println("\nList Objects: " + classmates + "\n");
	    
	    for (Student classmate : classmates) {
	           System.out.println(classmate.getName() + " " + classmate.getLast_name() + " of " + classmate.getCountry());
	    }

	}

}
