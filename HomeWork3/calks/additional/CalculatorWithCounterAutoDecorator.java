package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private long countCalculator = 0;
    private ICalculator iCalculator;

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    public ICalculator getiCalculator() {
        return this.iCalculator;
    }
    private void incrementCountCalculator(){
    this.countCalculator++;
    }

    @Override
    public double plus(double a, double b) {
        incrementCountCalculator();
        return this.iCalculator.plus(a, b);
    }
    @Override
    public double minus(double a, double b) {
        incrementCountCalculator();
        return this.iCalculator.minus(a, b);
    }
    @Override
    public double mult(double a, double b) {
        incrementCountCalculator();
        return this.iCalculator.mult(a, b);
    }
    @Override
    public double div(double a, double b) {
        incrementCountCalculator();
        return this.iCalculator.div(a, b);
    }
    @Override
    public double exp(double a, int n) {
        incrementCountCalculator();
        return this.iCalculator.exp(a, n);
    }
    @Override
    public double modul(double a) {
        incrementCountCalculator();
        return this.iCalculator.modul(a);
    }
    @Override
    public double square(double a) {
        incrementCountCalculator();
        return this.iCalculator.square(a);
    }
    public long getCountCalculator() {
        return this.countCalculator;
    }
}