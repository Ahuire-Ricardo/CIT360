package academy.HibernateJavaProject;

import java.util.List;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import academy.HibernateJavaProject.Student;


public class StoreData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	    
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();  
	    
	    Student s1 = new Student( "001","Ricardo","Ahuire");
		Student s2 = new Student( "002","Maribel","Flores");   
	   
		session.save(s1);
		session.save(s2);
		//PrintTransaction();
		s2.setLast_name("Seminario");
		t.commit();
		System.out.println(s1.getName()+" "+s1.getLast_name());
		System.out.println(s2.getName()+" "+s2.getLast_name());
		System.out.println("successfully saved");   
		
		factory.close();
		session.close();

	}
	
	
}
