package com.simplilearn.spring_core;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new  ClassPathXmlApplicationContext("application.xml");
        
        Employee e1 = (Employee)context.getBean("emp");
        System.out.println(e1);
        System.out.println(e1.getEid() +" "+e1.getEname());
        
        System.out.println(e1.getAddress());
    	
    	System.out.println(e1.getAddress().getCities());
    
	/*
	 * DAO dao = context.getBean("dao_ref",DAO.class);
	 * 
	 * System.out.println(dao);
	 * 
	 * dao.getDAO();
	 */
  		
//  ServiceDemo service =			context.getBean(ServiceDemo.class);
//    		
//  
//  		System.out.println(service);
//  		
//  		System.out.println(service.getDao());
//    	
//  		
//  		service.getDao().getDaoText();
//    	
//    	
//  		Employee employee2 =	context.getBean("employee2",Employee.class);
//  		
//  		System.out.println(employee2);
//  		
//  		System.out.println(employee2.getEid()+" "+employee2.getEname());
    
}
}
    

