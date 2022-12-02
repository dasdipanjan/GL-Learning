/**
 * 
 * Write a program in Java to implement classes and objects.
 * Create a class
 * Copy and paste the below code in class.
 * Create a main method in the class.
 * Create an object “obj” for the class in the main method.
 * Execute the copyMe() method using the object created.
 */

package com.great.learning.cch1;

public class ClassExample {

	public ClassExample() {
		// TODO Auto-generated constructor stub
	}

	void copyMe() {
		System.out.println("Inside copy me method");
	}

	public static void main(String[] args) {
		ClassExample obj = new ClassExample();
		obj.copyMe();
	}

}
