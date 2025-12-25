package com.tnsif.assignment;
import java.util.Scanner;
class C1 {
	
}
class D1 extends C1 {
	void show () {
		System.out.println("Child method called");
	}
	
}


public class Test6 {
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
	    int choice = sc.nextInt();
	    C1 obj;
	    if (choice == 1) {
	    	obj  = new D1();
	    	D1 d = (D1)obj;
	    	d.show();
	    }

		   // change this
	      	       
		
		 sc.close();

	}

}
