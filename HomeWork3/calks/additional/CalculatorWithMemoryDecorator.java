package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private ICalculator iCalculator;
    private double result;

    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    public ICalculator getiCalculator() {
        return this.iCalculator;
    }
    public double getMemory() {
        return this.result;
    }
    @Override
    public double plus(double a, double b) {
        this.result = this.iCalculator.plus(a, b);
        return this.result;
    }
    @Override
    public double minus(double a, double b) {
        this.result = this.iCalculator.minus(a, b);
        return this.result;
    }
    @Override
    public double mult(double a, double b) {
        this.result = this.iCalculator.mult(a, b);
        return this.result;
    }
    @Override
    public double div(double a, double b) {
        this.result = this.iCalculator.div(a, b);
        return this.result;
    }
    @Override
    public double exp(double a, int n) {
        this.result = this.iCalculator.exp(a, n);
        return this.result;
    }
    @Override
    public double modul(double a) {
        this.result = this.iCalculator.modul(a);
        return this.result;
    }
    @Override
    public double square(double a) {
        this.result = this.iCalculator.square(a);
        return this.result;
    }

}