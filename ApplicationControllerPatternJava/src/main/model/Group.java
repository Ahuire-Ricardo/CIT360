package main.model;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Student> students;
	
	
	public Group() {
		
		students=new ArrayList<>();
		
		students.add(new Student("001","Ricardo","Ahuire","Perú", Classification.FRESHMAN));
		students.add(new Student("002","Mariah","Ashley","USA", Classification.JUNIOR));
		students.add(new Student("003","Ryan","Danner","USA", Classification.SENIOR));
		students.add(new Student("004","Marie","De Guzmán","Philippines", Classification.SOPHOMORE));
		students.add(new Student("005","Daniel","De Melo","Brazil",Classification.FRESHMAN));
		students.add(new Student("006","Arthur","Streeter","USA",Classification.JUNIOR));
		students.add(new Student("007","Tyler","Tucker","USA", Classification.SENIOR));
			
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Group [students=\n\t");
		ArrayList<String> studentList = new ArrayList<>();
		for(Student student : students) {
			studentList.add(student.toString());
		}
		String studentStrings = String.join(",\n\t", studentList);
		builder.append(studentStrings);
		builder.append("\n]");
		return builder.toString();
	}

}
