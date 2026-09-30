package org.FirstApp;

import org.FirstApp.dao.Dao;
import org.FirstApp.dao.DaoImpl;
import org.FirstApp.entity.Student;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.setEmail("basha@gmail.com");
        s1.setId(4);
        s1.setName("basha_mabbu");

        Dao dt = new DaoImpl();
//
//        dt.saveStudent(s1);
//
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id that you want to retrieve");
  //      int id1=sc.nextInt();
//        System.out.println("enter the id that you want to retrieve");
//        
//     
//        int id2=sc.nextInt();
//         System.out.println("enter the id that you want to retrieve");
//
//       int id = sc.nextInt();
       
//
        Student st1 = dt.loadStudents(1);
        Student st2 = dt.loadStudents(2);
        Student st3 = dt.loadStudents(1);
        Student st4 = dt.loadStudents(2);
        Student st5 = dt.loadStudents(1);
//       Student st2 = dt.loadStudents(id);
//       Student st3 = dt.loadStudents(id2);
//
//       System.out.println(st);

//        dt.updateStudent(4,"basha_bhai");
//        System.out.println("Enter the id that you want to delete");
//        int a=sc.nextInt();
//        dt.deleteStudent(a);
//        
        sc.close();
    }
}