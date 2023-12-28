package com.assignments;

public class AreaCalculator {

    public void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of the square: " + area);
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculateArea(5, 8); 
        calculator.calculateArea(5); 
    }

}
