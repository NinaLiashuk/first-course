package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;
import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator {
    CalculatorWithMathExtends calculatorWithMathExtends;
    private long iCalculator = 0;
    double result;
    public CalculatorWithMemoryDecorator(CalculatorWithMathExtends calc) {
        this.calculatorWithMathExtends = calc;
    }

    @Override
    public double plus(double a, double b) {
        this.iCalculator++;
        return a + b;}
    @Override
    public double minus(double a, double b) {
        this.iCalculator++;
        return a - b;}
    @Override
    public double mult(double a, double b) {
        this.iCalculator++;
        return a * b;}
    @Override
    public double div(double a, double b) {
        this.iCalculator++;
        return a / b;}
    @Override
    public double exp(double a, int n) {
        this.iCalculator++;
        return Math.pow(a,n);}
    @Override
    public double modul(double a) {
        this.iCalculator++;
        return Math.abs(a);}
    @Override
    public double square(double a) {
        this.iCalculator++;
        return Math.sqrt(a);
    }
    public long getiCalculator() {
        return this.iCalculator;
    }
}