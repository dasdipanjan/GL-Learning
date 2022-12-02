package com.great.learning.cch4;

class RunTimePolymorphism {

	public RunTimePolymorphism() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		ClassA obj1 = new ClassB();
		obj.Car();
		obj1.Car();
	}

}
