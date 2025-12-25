package com.tnsif.assignment;
class A2 {
    int x = 10;
}

class B2 extends A2 {
    int x = 20;


@Override
	public String toString() {
	    //System.out.println(x);  
	    return " parent x=" + super.x +",Child x=" +x;
	}
}

	public class Test3 {
	public static void main(String[] args) {
		B2 b = new B2();
		System.out.println(b.toString());
		

	}

}
