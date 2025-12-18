package com.tnsif.oops.inheritance.demo;

class School{
	void display() {
		System.out.println("students are playing");
	}
	
	
	
}
class Playground extends School{
	
}
class Classroom extends School{
	
}

public class Demo {

	public static void main(String[] args) {
		Playground stu = new Playground();
		stu.display();
		

	}

}
