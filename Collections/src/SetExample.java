import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("Ricardo","Ahuire","Per�", "001");
        Student st2=new Student("Mariah","Ashley","USA", "002");
        Student st3=new Student("Ryan","Danner","USA", "003");
        Student st4=new Student("Marie","De Guzm�n","Philippines", "004");
        Student st5=new Student("Daniel","De Melo","Brazil", "005");
        Student st6=new Student("Arthur","Streeter","USA", "006");
        Student st7=new Student("Tyler","Tucker","USA", "007");
        //This line not printed because in the class student override the methods hashcode and equal
        Student st8=new Student("Ricardo","Ahuire","Per�", "001");

        Set<Student> classmates = new HashSet<Student>();

        classmates.add(st1);
        classmates.add(st2);
        classmates.add(st3);
        classmates.add(st4);
        classmates.add(st5);
        classmates.add(st6);
        classmates.add(st7);
        classmates.add(st8);

        System.out.println("The members in my group are:");

        for (Student classmate : classmates) {
           System.out.println(classmate.getName() + " " + classmate.getLast_name() + " of " + classmate.getCountry());
        }
        
     // Clearing all the elements
        classmates.clear();

        System.out.println("\nclassmates is Empty: " + classmates.isEmpty() +"\n");

        // Checking the number of elements
        System.out.println("classmates has: " + classmates.size() + " Elements\n");

	}

}
