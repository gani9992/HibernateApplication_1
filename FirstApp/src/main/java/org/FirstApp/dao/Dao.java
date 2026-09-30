package org.FirstApp.dao;
import org.FirstApp.entity.Student;
public interface Dao {
	public void saveStudent(Student s1);
	public Student loadStudents(int id);
	public void updateStudent(int id,String email);
	public void deleteStudent(int a);
}
