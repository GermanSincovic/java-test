package main.figure;

public class Rectangle {

    private final double a;
    private final double b;

    public Rectangle(double a){
        this.a = Math.abs(a);
        this.b = this.a;
        System.out.printf("Created rectangle (%sx%s)\n", this.a, this.b);
    }

    public Rectangle(double a, double b){
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        System.out.printf("Created rectangle (%sx%s)\n", this.a, this.b);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getArea(){
        return this.a * this.b;
    }

    public double getPerimeter(){
        return (this.a + this.b) * 2;
    }

    public boolean isSquare(){
        return this.a == this.b;
    }

}
