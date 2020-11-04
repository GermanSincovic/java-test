package main.figure;

public class Parallelepiped {

    private final double a;
    private final double b;
    private final double c;

    public Parallelepiped(double a){
        this.a = Math.abs(a);
        this.b = this.a;
        this.c = this.b;
        System.out.printf("Created parallelepiped (%sx%sx%s)\n", this.a, this.b, this.c);
    }

    public Parallelepiped(double a, double b, double c){
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.abs(c);
        System.out.printf("Created parallelepiped (%sx%sx%s)\n", this.a, this.b, this.c);
    }

    public double getVolume(){
        return this.a * this.b * this.c;
    }

    public double getSurfaceArea(){
        return (this.a * this.b + this.b * this.c + this.c * this.a) * 2;
    }

    public boolean isCube(){
        return this.a == this.b && this.a == this.c;
    }

}
