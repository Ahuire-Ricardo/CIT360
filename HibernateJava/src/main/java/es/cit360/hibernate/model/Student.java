package es.cit360.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_STUDENT")
	private String code_student;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LAST_NAME")
    private String last_name;
	
	@Column(name = "COUNTRY")
    private String country;
    
    
	public Student() {
		
	}

	public Student(String code_student, String name, String last_name, String country) {
		this.code_student = code_student;
		this.name = name;
		this.last_name = last_name;
		this.country = country;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode_student() {
		return code_student;
	}

	public void setCode_student(String code_student) {
		this.code_student = code_student;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", last_name=" + last_name + ", country=" + country + ", code_student="
				+ code_student + "]";
	}
	
 
    

}
