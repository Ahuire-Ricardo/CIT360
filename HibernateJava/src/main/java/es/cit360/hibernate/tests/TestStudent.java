package es.cit360.hibernate.tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.cit360.hibernate.model.Student;

public class TestStudent {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("application");
		manager = emf.createEntityManager();
		
		Student s1 = new Student( "001","Ricardo","Ahuire","Perú");
		Student s2 = new Student( "002","Maribel","Flores","Perú");
		
		manager.getTransaction().begin();
		manager.persist(s1);
		manager.persist(s2);
		s2.setLast_name("Seminario");
		PrintTransaction();
		manager.remove(s2);
		manager.getTransaction().commit();
		
		PrintTransaction();
		manager.close();
		
		//List<Student> students = (List<Student>) manager.createQuery("FROM Student").getResultList();
		//System.out.println("We have " + students.size() + "students.");

	}
	
	@SuppressWarnings("unchecked")
	private static void PrintTransaction() {
		List<Student> stu = (List<Student>) manager.createQuery("FROM Student").getResultList();
		System.out.println("We have " + stu.size() + " students.");
		
		for (Student stud : stu) {
			System.out.println(stud.toString());
		}
	}

}
