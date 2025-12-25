package com.tnsif.assignment;
class A3 {
    void display() {
        System.out.println("A display");
       
    }
}

class B3 extends A3 {
	@Override 
	void display() {
        System.out.println("B display");
}
}
public class Test4 {

	public static void main(String[] args) {
		A3 swa = new B3();
		swa.display();
    }
		

	}


