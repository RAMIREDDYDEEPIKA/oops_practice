package com.oops;

public class Cat {
    public String name;
    public int age;

    public Cat(){
        this.name="unknown";
        this.age=0;
    }

    public void display(){
        System.out.println("Cat's name:"+name);
        System.out.println("Cat's age:"+age);
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.display();
    }
}
