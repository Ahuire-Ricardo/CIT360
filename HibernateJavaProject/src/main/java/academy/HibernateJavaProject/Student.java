package academy.HibernateJavaProject;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	private String code_student;
	
	private String name,last_name;

	public Student(String code_student, String name, String last_name) {
		// TODO Auto-generated constructor stub
		this.code_student=code_student;
		this.name=name;
		this.last_name=last_name;
	}

	public String getCode_student() {
		return code_student;
	}

	public void setCode_student(String code_student) {
		this.code_student = code_student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

	

}
