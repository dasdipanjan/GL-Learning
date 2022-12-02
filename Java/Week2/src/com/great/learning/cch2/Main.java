/**
 * Write an algorithm to create classes InheritanceA, InheritanceB and InheritanceC to find the area of circleArea, 
 * rectangleArea and triangleArea respectively. Use multi level inheritance and execute all methods using the object of class
 * InheritanceC. 
 * Note: create methods circleArea, rectangleArea and triangleArea in the classes InheritanceA,
 * InheritanceB and InheritanceC respectively.
 */

package com.great.learning.cch2;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		InhertanceC inhertanceC = new InhertanceC();
		System.out.println("Area of a circle with radious 11.5 cm = "+inhertanceC.areaOfCircle(11.5d)+" cm2");
		System.out.println("Area of a rectangle with length 9cm and width 6cm = "+inhertanceC.rectangleArea(9, 6)+" cm2");
		System.out.println("Area of a trangle with base 8cm and width 5cm = "+inhertanceC.triangleArea(8, 5)+" cm2");
	}

}
