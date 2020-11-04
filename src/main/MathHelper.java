package main;

public class MathHelper {

    public static double getArithmeticalMean(double a, double b){
        return (a + b) / 2;
    }

    public static double getGeometricMean(double a, double b){
        return Math.sqrt(a * b);
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if(b != 0){
            return a / b;
        } else {
            return 0.000000000000;
        }
    }

    public static double sqr(double a){
        return Math.pow(a, 2);
    }

}
