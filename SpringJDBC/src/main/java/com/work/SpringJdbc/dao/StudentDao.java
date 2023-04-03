package com.work.SpringJdbc.dao;

import com.work.SpringJdbc.Entity.Student;

public interface StudentDao {
//	public int insert(Student student);
	//specific student details
	public Student getStudent(String usn);
}
