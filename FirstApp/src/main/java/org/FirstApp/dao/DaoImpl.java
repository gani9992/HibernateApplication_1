package org.FirstApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.FirstApp.dao.*;
import org.FirstApp.entity.Student;
import org.hibernate.Transaction;


public class DaoImpl implements Dao {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	public void saveStudent(Student student) {
		Session s2=factory.openSession();
		Transaction t1=s2.beginTransaction();
		try {
			s2.persist(student);
			System.out.print("data saved successfully..!!");
			t1.commit();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			t1.rollback();
		}
		s2.close();
		
	}

	public Student loadStudents(int id) {
		Session s2=factory.openSession();
		//	Transaction t1=s2.beginTransaction();
		Student st1=s2.get(Student.class,id);
//		Student st2=s2.get(Student.class, 2);
//		Student st3=s2.get(Student.class, 3);
//		Student st4=s2.get(Student.class, 1);
//		Student st5=s2.get(Student.class, 2);
//		try {
//			Thread.sleep(15000);
//		}
//		catch(Exception e) {
//			
//		}
//		
		System.out.println(st1);
//		s2.close();
	
		return st1;
	}

	public void updateStudent(int id,String email) {
		Session s2=factory.openSession();
		Student s=s2.get(Student.class,id);
		s.setEmail(email);
		System.out.println("after the updation the value is: "+s);
		Transaction t1=s2.beginTransaction();
		try {
			
		s2.update(s);
		t1.commit();
		System.out.println("updated successfully..!!");
		}
		catch(Exception e) {
			t1.rollback();
			System.out.println(e);
		}
		t1.close();
		s2.close();
		
	}
	
	public void deleteStudent(int id) {
		Session s3=factory.openSession();
		Student s4=s3.load(Student.class, id);
		Transaction t1=s3.beginTransaction();
		try {
			s3.delete(s4);
			t1.commit();
			System.out.println("deleted successfully..!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			t1.rollback();
			
		}
		s3.close();
	}
}
