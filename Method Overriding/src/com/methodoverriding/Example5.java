package com.methodoverriding;

class Shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing square");
	}
}

public class Example5 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle();
		shapes[1] = new Square();
		
		for(Shape s : shapes) {
			s.draw();
		}
	}

}
