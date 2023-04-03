package com.work.SpringJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.work.SpringJdbc.Entity.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbctempl;

	
//	public int insert(Student student) {
//		String inquery="insert into jdbcspring.student value(?,?,?)";
//		int result=jdbctempl.update(inquery,student.getUsn() ,student.getName() ,student.getCity() );
//		System.out.println("record inserted "+ result);
//		return result;
//	}
	public JdbcTemplate getJdbctempl() {
		return jdbctempl;
	}
	public void setJdbctempl(JdbcTemplate jdbctempl) {
		this.jdbctempl = jdbctempl;
	}
	public Student getStudent(String usn) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	//specific student details
	
//	public Student getStudent(String usn) {
//		String sql= "select * from jdbcspring.student where usn=?";
//		RowMapper<Student> r= new RowMapperImpl();
//		Student Student=this.jdbctempl.queryForObject(sql, r, usn);
//		return Student;
//	}
	
	public List<Student> getStudent() {
		String sql= "select * from jdbcspring.student ";
		List<Student> s= (List<Student>) jdbctempl.query(sql, new RowMapperImpl());
		
		return  (List) s;
	}
	
	

}
