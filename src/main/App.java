package main;

import main.figure.Circle;
import main.figure.Parallelepiped;
import main.figure.Rectangle;

public class App {

    public static void main(String[] args) {

//        #1
        {
            System.out.println("_ _ _ _ _ Task #1 _ _ _ _ _");
            Rectangle rectangle = new Rectangle(5);
            System.out.printf("Rectangle perimeter = %s\n\n", rectangle.getPerimeter());
        }

//        #2
        {
            System.out.println("_ _ _ _ _ Task #2 _ _ _ _ _");
            Rectangle rectangle = new Rectangle(6);
            System.out.printf("Rectangle area = %s\n\n", rectangle.getArea());
        }

//        #3
        {
            System.out.println("_ _ _ _ _ Task #3 _ _ _ _ _");
            Rectangle rectangle = new Rectangle(6, 8);
            System.out.printf("Rectangle area = %s\n\n", rectangle.getArea());
        }

//        #4
        {
            System.out.println("_ _ _ _ _ Task #4 _ _ _ _ _");
            Circle circle = new Circle(10);
            System.out.printf("Circle length = %s\n\n", circle.getLength());
        }

//        #5
        {
            System.out.println("_ _ _ _ _ Task #5 _ _ _ _ _");
            Parallelepiped parallelepiped = new Parallelepiped(3);
            System.out.printf("Parallelepiped volume = %s\n\n", parallelepiped.getVolume());
        }

//        #6
        {
            System.out.println("_ _ _ _ _ Task #6 _ _ _ _ _");
            Parallelepiped parallelepiped = new Parallelepiped(3, 4, 5);
            System.out.printf("Parallelepiped volume = %s\n", parallelepiped.getVolume());
            System.out.printf("Parallelepiped volume = %s\n\n", parallelepiped.getSurfaceArea());
        }

//        #7
        {
            System.out.println("_ _ _ _ _ Task #7 _ _ _ _ _");
            Circle circle = new Circle(3);
            System.out.printf("Circle length = %s\n", circle.getLength());
            System.out.printf("Circle area = %s\n\n", circle.getArea());
        }


//        #8
        {
            System.out.println("_ _ _ _ _ Task #8 _ _ _ _ _");
            double a = 5;
            double b = 8;
            System.out.printf("Arithmetical mean (%s, %s) = %s\n\n", a, b, MathHelper.getArithmeticalMean(5, 8));
        }

//        #9
        {
            System.out.println("_ _ _ _ _ Task #9 _ _ _ _ _");
            double a = 5;
            double b = 8;
            System.out.printf("Geometric mean (%s, %s) = %s\n\n", a, b, MathHelper.getGeometricMean(5, 8));
        }

//        #10
        {
            System.out.println("_ _ _ _ _ Task #10 _ _ _ _ _");
            double a = 5;
            double b = 8;
            System.out.printf("%s² + %s² = %s\n", a, b, MathHelper.add(MathHelper.sqr(a), MathHelper.sqr(b)));
            System.out.printf("%s² - %s² = %s\n", a, b, MathHelper.subtract(MathHelper.sqr(a), MathHelper.sqr(b)));
            System.out.printf("%s² * %s² = %s\n", a, b, MathHelper.multiply(MathHelper.sqr(a), MathHelper.sqr(b)));
            System.out.printf("%s² / %s² = %s\n\n", a, b, MathHelper.divide(MathHelper.sqr(a), MathHelper.sqr(b)));
        }

    }

}