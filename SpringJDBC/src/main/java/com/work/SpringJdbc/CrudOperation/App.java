package com.work.SpringJdbc.CrudOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.work.SpringJdbc.Entity.Student;
import com.work.SpringJdbc.dao.StudentDao;
import com.work.SpringJdbc.dao.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Excecution Started" );
        ApplicationContext con = new ClassPathXmlApplicationContext("com/work/SpringJdbc/CrudOperation/JdbcConfig.xml");
//        Student s=con.getBean("student1",Student.class);
//        System.out.println(s);
//          JdbcTemplate a=  con.getBean("jdbcTemplate",JdbcTemplate.class);
          
          //inserting record
//          String query="insert into jdbcspring.student value(?,?,?)";
//          int b=a.update(query,"dkjh12","akshay","manglore");
//          System.out.println("record inserted"+b);
          
//          deleting query
//          String query ="delete from jdbcspring.student";
//          int b=a.update(query);
//          System.out.println("record deleted "+b);
        	
        
        	StudentDao s=con.getBean("studentdaoimpl",StudentDaoImpl.class);
//        	
//        	Student a = new Student();
//        	a.setUsn("2");
//        	a.setName("ravi");
//        	a.setCity("blr");
//        	int result=s.insert(a);
//        	System.out.println(result);
        	
        	//if i want to get the bean of student
        	Student b=con.getBean("s",Student.class);
        	s.insert(b);
        System.out.println( "Application Excecution Ended" );
    }
}
