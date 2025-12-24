package com.tnsif.assignment;

class A {
	    void show() {
	        System.out.println("A");
	    }
	}

	class B extends A {
	    void show() {
	        System.out.println("B");
	    }
	    public class Test {
	
		public static void main(String[] args) {
	        A obj = new B();   
	        obj.show();
	    }

	}

	}
