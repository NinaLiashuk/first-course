package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {
    ICalculator iCalculator;
    int countOperation = 0;
    public CalculatorWithCounterAutoCompositeInterface(ICalculator calc){
        this.iCalculator = calc;
    }
    public double plus(double a, double b) {
        countOperation++;
        return a + b;
    }
    public double minus(double a, double b) {
        countOperation++;
        return a - b;
    }
     public double mult(double a, double b) {
        countOperation++;
        return a * b;
    }
    public double div(double a, double b) {
        countOperation++;
        return a / b;
    }
    public double exp(double a, int n) {
        countOperation++;
        return Math.pow(a, n);
    }
    public double modul(double a) {
        countOperation++;
        return Math.abs(a);
    }
    public double square(double a) {
        countOperation++;
        return Math.sqrt(a);
    }
    public long getCountOperation(){
        return this.countOperation;
    }
}
