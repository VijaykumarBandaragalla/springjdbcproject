package com.work.SpringJdbc.CrudOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Excecution Started" );
        ApplicationContext con = new ClassPathXmlApplicationContext("com/work/SpringJdbc/CrudOperation/JdbcConfig.xml");
//        Student s=con.getBean("student1",Student.class);
//        System.out.println(s);
          JdbcTemplate a=  con.getBean("jdbcTemplate",JdbcTemplate.class);
          
          //inserting record
//          String query="insert into jdbcspring.student value(?,?,?)";
//          int b=a.update(query,"dkjh12","akshay","manglore");
//          System.out.println("record inserted"+b);
          
//          deleting query
          String query ="delete from jdbcspring.student";
          int b=a.update(query);
          System.out.println("record deleted "+b);

        System.out.println( "Application Excecution Ended" );
    }
}
