import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student("Ricardo","Ahuire","Perú", "001");
        Student st2=new Student("Mariah","Ashley","USA", "002");
        Student st3=new Student("Ryan","Danner","USA", "003");
        Student st4=new Student("Marie","De Guzmán","Philippines", "004");
        Student st5=new Student("Daniel","De Melo","Brazil", "005");
        Student st6=new Student("Arthur","Streeter","USA", "006");
        Student st7=new Student("Tyler","Tucker","USA", "007");
        
        Map<String, Student> classmates = new HashMap<String, Student>();
        
        classmates.put("Ricardo", st1);
        classmates.put("Mariah", st2);
        classmates.put("Ryan", st3);
        classmates.put("Marie", st4);
        classmates.put("Daniel", st5);
        classmates.put("Arthur", st6);
        classmates.put("Tyler", st7);
        
        System.out.println("Total Students: " + classmates.size());
        
        for (Entry<String, Student> student : classmates.entrySet()){
        	String clave = student.getKey();
        	Student valor = student.getValue();
        	System.out.println(clave+"  ->  "+valor.toString());
        }
        
        String searchKey = "Ryan";
        
        System.out.println("\nNumber of students with the name:Ryan\n");
        
		if(classmates.containsKey(searchKey))
			System.out.println("Found total: " + classmates.get(searchKey) + " with the name "
					+ searchKey + " \n");
		
		classmates.clear();
		
		// Checking the number of elements
        System.out.println("classmates has: " + classmates.size() + " Elements\n");

	}

}
