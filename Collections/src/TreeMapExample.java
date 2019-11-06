import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student("Ricardo","Ahuire","Perú", "001");
        Student st2=new Student("Mariah","Ashley","USA", "002");
        Student st3=new Student("Ryan","Danner","USA", "003");
        Student st4=new Student("Marie","De Guzmán","Philippines", "004");
        Student st5=new Student("Daniel","De Melo","Brazil", "005");
        Student st6=new Student("Arthur","Streeter","USA", "006");
        Student st7=new Student("Tyler","Tucker","USA", "007");
        
        TreeMap<String, Student> classmates = new TreeMap<String, Student>();
        
        classmates.put("001", st1);
        classmates.put("002", st2);
        classmates.put("003", st3);
        classmates.put("004", st4);
        classmates.put("005", st5);
        classmates.put("006", st6);
        classmates.put("007", st7);
        
        System.out.println("Total Students: " + classmates.size());
        
        Iterator<String> it = classmates.keySet().iterator();
        
        it = classmates.keySet().iterator();
        while(it.hasNext()){
          Object key = it.next();
          System.out.println("Clave: " + key + " -> Value: " + classmates.get(key).getLast_name());
        }
        
        System.out.println("********* Working with methods in Tree Maps *********");
        System.out.println("We shows the number of elements in the TreeMap: "+classmates.size());
        System.out.println("We can see if the TreeMap is Empty: "+classmates.isEmpty());
        System.out.println("We have the element of the TreeMap with the key 001: "+classmates.get("001").getLast_name());
        System.out.println("We remove the element of the TreeMap with the key 003: "+classmates.remove("003").getLast_name());
        System.out.println("We see what happens if we want to get the key 003: "+classmates.get("003"));
        System.out.println("We see if there is an element with the key 003: "+classmates.containsKey("003"));
        System.out.println("We remove all the elements of the Map: "); classmates.clear();
        System.out.println("We check if we have removed it by seeing its size: "+classmates.size());
        System.out.println("We also check it by seeing if it is empty: "+classmates.isEmpty());

	}

}
