package com.company.shape;

public class Circle extends Shape {
    public static final float PI = 3.14f;
    public Circle() {
    }

    public Circle(double d) {
        super(d);
    }

    @Override
    protected void getArea(double d) {
        System.out.println("Circle area: "+Math.pow(d/2,2)*PI);
    }

    @Override
    protected void getPerimeter(double d) {
        System.out.println("Circle perimeter: "+2*d*PI);

    }
}
