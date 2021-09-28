package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    CalculatorWithMemoryDecorator calculatorWithMemoryDecorator;
    private long iCalculator = 0;
    double result;
    public CalculatorWithCounterAutoDecorator(CalculatorWithMemoryDecorator calc){
        this.calculatorWithMemoryDecorator = calc;
    }

    @Override
    public double plus(double a, double b) {
        this.iCalculator++;
        double result = a + b;
        return result;
    }
    @Override
    public double minus(double a, double b) {
        this.iCalculator++;
        double result = a - b;
        return result;
    }
    @Override
    public double mult(double a, double b) {
        this.iCalculator++;
        double result = a * b;
        return result;
    }
    @Override
    public double div(double a, double b) {
        this.iCalculator++;
        double result = a / b;
        return result;
    }
    @Override
    public double exp(double a, int n) {
        this.iCalculator++;
        double result = Math.pow(a,n);
        return result;
    }
    @Override
    public double modul(double a) {
        this.iCalculator++;
        double result = Math.abs(a);
        return result;
    }
    @Override
    public double square(double a) {
        this.iCalculator++;
        double result = Math.sqrt(a);
        return result;
    }
    public long getiCalculator() {
        return this.iCalculator;
    }
    public double getResult(){
        return result;
    }
}