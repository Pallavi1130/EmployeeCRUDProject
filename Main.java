package com.emp.main;

import java.util.List;

import javax.persistence.criteria.CriteriaDelete;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.employee.model.Employee;

public class Main {

	public static void main(String[] args) {
	SessionFactory sf=	new Configuration().configure().buildSessionFactory();
		         Session s=sf.openSession();    
		         Transaction t=s.beginTransaction();
//		         creating a table and inserting data into it.
		         Employee e1=new Employee("sandya",".net",25000);
		         Employee e2=new Employee("rohan",".java",35000);
		         Employee e3=new Employee("dhairya","php",30000);
		         Employee e4=new Employee("mohali","python",45000);
		         s.save(e1);
		         s.save(e2);
		         s.save(e3);
		         s.save(e4);  
		         
		         
//		         updating data
		       Employee emp2=  s.get(Employee.class, 2);
		         emp2.setEmpname("soham");
		         s.update(emp2);
//		         
//		         deleting data 
		         Employee emp4=s.get(Employee.class, 4);
		         emp4.setEmpid(4);
	             s.delete(emp4);
		         
//		         reading data on console
		         Query query=s.createQuery("from Employee");
		         List<Employee> ls=query.list();
		         for(Employee temp:ls) {
		        	 System.out.println(temp.getEmpid());
		        	 System.out.println(temp.getEmpname());
		        	 System.out.println(temp.getEmpdept());
		        	 System.out.println(temp.getEmpsal());
		        	 System.out.println("____________________________");
		         }
//		     
		         t.commit();
		         s.close();
                 sf.close();
	}

}
