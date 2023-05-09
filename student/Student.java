package org.student;

import org.Department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("lekshmanan");
	}
	public void studentDept() {
		System.out.println("MCA dept");
	}
	public void studentID() {
		System.out.println("48");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentID();
		std.studentName();
	
			
	}

}
