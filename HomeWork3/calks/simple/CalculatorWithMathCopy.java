package HomeWork3.calks.simple;
import HomeWork3.calks.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator{
    public double plus(double a, double b){
        return a + b;
    }
    public double minus(double a, double b){
        return a - b;
    }
    public double mult(double a , double b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }
    public double exp(double a, int n) {
        return Math.pow(a, n);
    }
    public  double modul (double a){
        return Math.abs(a);
    }
    public double square(double a){
        return Math.sqrt(a);
    }
}

