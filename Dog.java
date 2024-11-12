package com.oops;

public class Dog {
    public String name;
    public String color;
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    public void display(){
        System.out.println("Dog's Name: "+name);
        System.out.println("Dog's color: "+color);
    }

    public static void main(String[] args) {
        Dog dog=new Dog("miniature poodle","white");
        dog.display();
    }
}
