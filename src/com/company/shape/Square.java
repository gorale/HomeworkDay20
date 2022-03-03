package com.company.shape;

public class Square extends Shape {
    public Square() {
    }

    public Square(double d) {
        super(d);
    }


    @Override
    protected void getArea(double d) {
        System.out.println("Square area: "+Math.pow(d,2));
    }

    @Override
    protected void getPerimeter(double d) {

        System.out.println("Square perimeter: "+4*d);
    }
}
