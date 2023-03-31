package com.work.SpringJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.work.SpringJdbc.Entity.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbctempl;
	
	public int insert(Student student) {
		String inquery="insert into jdbcspring.student value(?,?,?)";
		int result=jdbctempl.update(inquery,student.getUsn() ,student.getName() ,student.getCity() );
		System.out.println("record inserted "+ result);
		return result;
	}
	public JdbcTemplate getJdbctempl() {
		return jdbctempl;
	}
	public void setJdbctempl(JdbcTemplate jdbctempl) {
		this.jdbctempl = jdbctempl;
	}

}
