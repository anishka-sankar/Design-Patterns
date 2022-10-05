package Prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		StudentDao dao=new StudentDao(); // just one time creation 
		
		System.out.println("list 1....");
		List<Student> l1=dao.getStudents();
		l1.forEach(System.out::println);
		
		System.out.println("list 2....");
		List<Student> l2=dao.getStudents();
		l2.add(new Student("3","John"));
		l2.forEach(System.out::println);
		
	}

}
