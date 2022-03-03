package com.company.shape;

public abstract class Shape {


    private double d = 4;


    public Shape() {
    }

    public Shape(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    protected abstract void getArea(double d);

    protected abstract void getPerimeter(double d);


}
