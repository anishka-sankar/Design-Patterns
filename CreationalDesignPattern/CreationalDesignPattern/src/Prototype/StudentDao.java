package Prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private static List<Student> studentList = new ArrayList();
	
	static {
		studentList.add(new Student("1","Rohee"));
		studentList.add(new Student("2","Romi"));
	}
	
	public List<Student> getStudents(){
		return studentList;
	}
	
	@Override
	public List<Student> clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<Student> stu=new ArrayList();
		stu.forEach(s -> stu.add(s));
		return stu;
	}
	
}
