package com.tnsif.basics;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n,first=0,second=1,next;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of series:");
		  n=sc.nextInt();
				System.out.println("Fibonacci Series:");
				for(int i=1; i<=n;i++) {
					System.out.println(first+"");
					next = first + second ;
					first =second;
					second = next;
				}
		

	}

}
