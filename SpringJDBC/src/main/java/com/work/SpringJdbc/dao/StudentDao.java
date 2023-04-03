package com.work.SpringJdbc.dao;

import java.util.List;

import com.work.SpringJdbc.Entity.Student;

public interface StudentDao {
//	public int insert(Student student);
	//specific student details
	public Student getStudent(String usn);
	
	//to fetch multiple student details
	public List<Student> getStudent();
}
