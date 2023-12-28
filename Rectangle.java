package com.assignments;

public class Rectangle {
	private double lenght;
	private double breadth;
	
	public Rectangle(double lenght,double breadht) {
		this.lenght = lenght;
		this.breadth = breadth;
	}
	public double calculatePerimeter() {
		return 2*(lenght+breadth);
	}
}
class Square extends Rectangle{
	
	public Square(double side) {
		super(side,side);
	}

	  public static void main(String[] args) {
		  Rectangle rectangle = new Rectangle(5.0, 7.0);
	        System.out.println("Rectangle:");
	        System.out.println("Area: " + rectangle.calculatePerimeter());
	        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	        
	        Square square = new Square(4.0);
	        System.out.println("\nSquare:");
	        System.out.println("Area: " + square.calculatePerimeter());
	        System.out.println("Perimeter: " + square.calculatePerimeter());
	}
	  
}