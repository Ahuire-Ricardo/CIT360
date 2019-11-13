package main.model;

import java.util.Objects;

public class Student {
	
	private String name;
    private String last_name;
    private String country;
    private String code_student;
    private Classification classification;
    
    public Student(String code_student,String name, String last_name, String country,  Classification classification) {
		this.name = name;
		this.last_name = last_name;
		this.country = country;
		this.code_student = code_student;
		this.classification=classification;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String code_student, String name, String last_name, Classification classification) {
		// TODO Auto-generated constructor stub
		this.code_student = code_student;
		this.name = name;
		this.last_name = last_name;
		this.classification=classification;
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
	
	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(code_student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(code_student, other.code_student);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", last_name=" + last_name + ", country=" + country + ", code_student="
				+ code_student + ",  classification=" + classification + "]";
	}

	
	
	

	


}
