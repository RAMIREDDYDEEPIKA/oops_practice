package com.oops;

public interface Shape {
    double getArea();
}

class Rectangle implements Shape{
    public double length;
    public double breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double getArea(){
        return length*breadth;
    }
}
class Circle implements Shape{
    public double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
class Triangle implements Shape{
    public double height;
    public double breadth;
    public Triangle(double heigth,double breadth){
        this.height=heigth;
        this.breadth=breadth;
    }

    @Override
    public double getArea() {
        return 0.5*breadth*height;
    }
}
public class MainPrgm {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(3,4);
        Circle cir=new Circle(4);
        Triangle tri=new Triangle(10,4);
        System.out.println("Rectangle area: "+rec.getArea());
        System.out.println("Circle area: "+cir.getArea());
        System.out.println("Triangle area: "+tri.getArea());
    }
}
