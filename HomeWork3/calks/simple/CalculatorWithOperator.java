package HomeWork3.calks.simple;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double exp(double a, int n) {   // возведение в степень
        double result = a;
        for (int i = n; i > 1; i--) {
            result = result * a;
        }
        return result;
    }

    public double modul(double a) {   // модуль числа
        if (a < 0){
            a = a * (-1);   // return -a;
        }
        else{
            a = a;  //  return a;
        }
        return a;
    }

    public double square(double a) {  // квадратный корень числа
        double b = 0;
        do {
            b = b + 0.01;
        }
        while (b * b <= a);
        return b;
    }
}


