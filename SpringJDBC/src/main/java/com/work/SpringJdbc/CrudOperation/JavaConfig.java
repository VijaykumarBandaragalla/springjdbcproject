package com.work.SpringJdbc.CrudOperation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.work.SpringJdbc.dao.StudentDao;
import com.work.SpringJdbc.dao.StudentDaoImpl;

@Configuration
public class JavaConfig {

	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/jdbcspring");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
		
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate(getDataSource());
		return jt;
		
	}
	
	@Bean("StudentDaoImpl")
	public StudentDaoImpl getStudent() {
		StudentDaoImpl st = new StudentDaoImpl();
		st.setJdbctempl(getJdbcTemplate());
		return st;
	}
}
