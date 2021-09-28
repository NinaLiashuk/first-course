package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithMemory extends CalculatorWithMathExtends {
    double result;

    @Override
    public double plus(double a, double b) {
        result = super.plus(a, b);
        return result;
    }
    @Override
    public double minus(double a, double b) {
        result = super.minus(a, b);
        return result;
    }
    @Override
    public double mult(double a, double b) {
        result = super.mult(a, b);
        return result;
    }
    @Override
    public double div(double a, double b) {
        result = super.div(a, b);
        return result;
    }
    @Override
    public double exp(double a, int n) {
        result = super.exp(a, n);
        return result;
    }
    @Override
    public double modul(double a) {
        result = super.modul(a);
        return result;
    }
    @Override
    public double square(double a) {
        result = super.square(a);
        return result;
    }
    public double getResult() {
        return result;
    }
}
