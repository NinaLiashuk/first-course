package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int countOperation = 0;
    @Override
    public double plus(double a, double b) {
        this.countOperation ++;
        return super.plus(a, b);
    }
    @Override
    public double minus(double a, double b) {
        this.countOperation ++;
        return super.minus(a, b);
    }
    @Override
    public double mult(double a, double b) {
        this.countOperation ++;
        return super.mult(a, b);
    }
    @Override
    public double div(double a, double b) {
        this.countOperation ++;
        return super.div(a, b);
    }
    @Override
    public double exp(double a, int n) {
        this.countOperation ++;
        return super.exp(a, n);
    }
    @Override
    public double modul(double a) {
        this.countOperation ++;
        return super.modul(a);
    }
    @Override
    public double square(double a) {
        this.countOperation ++;
        return super.square(a);
    }
    public long getCountOperation(){
        return this.countOperation;
    }
}

