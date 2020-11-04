package main.figure;

public class Circle {

    private final double radius;

    public Circle(double radius){
        this.radius = Math.abs(radius);
        System.out.printf("Created circle (R=%s)\n", this.radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getLength(){
        return 2 * Math.PI * this.radius;
    }

}
