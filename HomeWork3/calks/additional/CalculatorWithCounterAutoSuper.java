package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation = 0;
    private void incrementcountOperation(){
    countOperation++;
    }
    @Override
    public double plus(double a, double b) {
        incrementcountOperation();
        return super.plus(a, b);
    }
    @Override
    public double minus(double a, double b) {
        incrementcountOperation();
        return super.minus(a, b);
    }
    @Override
    public double mult(double a, double b) {
        incrementcountOperation();
        return super.mult(a, b);
    }
    @Override
    public double div(double a, double b) {
        incrementcountOperation();
        return super.div(a, b);
    }
    @Override
    public double exp(double a, int n) {
        incrementcountOperation();
        return super.exp(a, n);
    }
    @Override
    public double modul(double a) {
        incrementcountOperation();
        return super.modul(a);
    }
    @Override
    public double square(double a) {
        incrementcountOperation();
        return super.square(a);
    }
    public long getCountOperation(){
        return this.countOperation;
    }
}

