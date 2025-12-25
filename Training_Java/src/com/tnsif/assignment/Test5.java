package com.tnsif.assignment;

class Person {
	 void show(){
		System.out.println("Student1:divya ");
	}
	
}
class Student extends Person{
	@Override
	 void show(){
		System.out.println("Student2:Swathi");
	}
	@Override
	public String toString() {
		return "Class Leader: Divya, Asst Leader: Swathi";
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		Person sc= new Student();
		sc.show();
System.out.println(sc.toString());
	}

}
