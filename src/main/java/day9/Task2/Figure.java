package day9.Task2;

public abstract class Figure {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();
}


class Circle extends Figure {
    int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * (radius * radius);

    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle extends Figure{
    int width;
    int length;

    Rectangle(String color, int width, int length){
        super(color);
        this.width=width;
        this.length=length;
    }
    @Override
    public double area(){
        return width*length;
    }

    @Override
    public double perimeter() {
        return (width + length)*2;
    }
}

class Triangle extends Figure{
    int side1;
    int side2;
    int side3;

    Triangle(String color, int side1, int side2, int side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double area() {
        return side1*side2*side3;
    }

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }
}