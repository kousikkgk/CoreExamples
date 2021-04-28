package com.coreexamples.main;
class A {
	void add() {
		System.out.println("A impl");
	}
}

class B extends A {
	void add() {
		System.out.println("B impl");
	}

	void add2() {
		System.out.println("B impl add...");
	}
}

class C {
	void overrideMethod() {
		System.out.println("C impl");
	}
}

class D extends C {
	@Override
	//void overrideMethod() throws Exception{ 
		/** Method signature is wrong**/
	void overrideMethod() {
	}
}

class Point {
	protected int x, y;

	public Point() {
	}

	public Point(int _x, int _y) {
		_x = x;
		_y = y;
	}
}

public class CoreMain {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println("X=" + p.x + "Y=" + p.y);

		A a = new B();
		a.add();
		// a.add2(); we can't access the method using the a reference variable

		/**
		 * if(true) { break; }
		 **/
	}

}
