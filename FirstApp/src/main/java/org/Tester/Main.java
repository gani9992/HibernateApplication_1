package org.Tester;
import org.FirstApp.dao.Dao;
import org.FirstApp.dao.DaoImpl;
import org.FirstApp.entity.Student;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Student s1=new Student();
		s1.setEmail("basha@gmail.com");
		s1.setId(4);
		s1.setName("basha_mabbu");
		Dao dt=new DaoImpl();
		//dt.saveStudent(s1);
		System.out.println("enter the id that you want to retrieve");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		dt.loadStudents(id);
		
	}
	

}
