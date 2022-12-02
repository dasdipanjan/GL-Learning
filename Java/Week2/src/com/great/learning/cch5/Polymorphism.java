package com.great.learning.cch5;

public class Polymorphism {

	public int length, breadth, height, result;

	public void findArea(int l, int b) {
		length = l;
		breadth = b;
		result = length * breadth;
		System.out.println("The area of rectangle is: " + result + " cmsquare");
	}

	public void findArea(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		result = length * breadth * height;
		System.out.println("The area of cuboid is: " + result + " cm cube");
	}
}
