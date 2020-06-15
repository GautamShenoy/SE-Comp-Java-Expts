package com.javaexpts.expt7;

public class Shape {
    protected double length;
    protected  double breadth;
    protected double area;

    Shape() {
        this.length = 0.0;
        this.breadth = 0.0;
        this.area = 0;
    }

    Shape(double length ,double breadth ) {
        this.breadth = breadth;
        this.length = length;
    }

    Shape ( double length) {
        this.length = length;
        this.breadth = 0.0;
    }

    public void calculateArea () {
        area = length * breadth ;
    }

    public void display () {
        System.out.println("Area of the figure : " + area);
    }

}
