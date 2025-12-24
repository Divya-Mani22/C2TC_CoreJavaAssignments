package com.tnsif.multipleinteritance;
interface A{
	void show();
	
}
interface B{
	void display();
	
	
}
class C implements A,B{
	@Override
	 public void show() {
		System.out.println("diya");
	}
	@Override
	 public void display() {
		System.out.println("divya");
	}
}
public class MultipleInteritanceDemo {

	public static void main(String[] args) {
		C c= new C();
		c.display();

	}

}
