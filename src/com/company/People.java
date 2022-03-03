package com.company;

public abstract class People {
    protected String name;
    protected int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void male(){
        System.out.println("male");
    }
    protected void female(){
        System.out.println("female");
    }
}
