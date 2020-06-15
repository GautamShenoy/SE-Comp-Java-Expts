package com.javaexpts.expt7;
import java.util.Scanner;

public class Test1 extends Shape {
    protected double height ;

    Test1() {
        super();
        this.height = 0.0;
    }

    Test1 (double length , double breadth , double height ){
        super(length,breadth);
        this.height = height;
    }
    Test1 (double length , double height) {
        super(length);
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = length * breadth * height ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double length, breadth, height;
        System.out.println("Enter length breadth and height");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();
        Test1 obj1 = new Test1 ();
        Test1 obj2 = new Test1 (length,breadth,height);
        Test1 obj3 = new Test1 (length,height);
        obj1.calculateArea();
        obj2.calculateArea();
        obj3.calculateArea();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
