/**
 * a.Start
 * b.Create a classPolymorphism
 * c.Create a methodfindArea
 * d.Pass two integer parameters to the method
 * e.Write logic to calculate the area of rectangle
 * f.Create another methodfindArea
 * g.Pass three integer parameters to the method
 * h.Write logic to calculate the area of cuboid
 * i.Create a main method in the class 
 * with objectpolymorphismj.Execute the methodfindAreaby passing the parametersas requiredk.Stop
 */

package com.great.learning.cch5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.findArea(7, 9);
		polymorphism.findArea(7, 9, 5);

	}

}
