package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("studentName - Student class");
	}
	
	public void studentDept() {
		System.out.println("studentDept - Student class");
	}
	
	public void studentId() {
		System.out.println("studentId - Student class");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
