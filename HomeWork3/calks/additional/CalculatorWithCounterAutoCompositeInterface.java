package HomeWork3.calks.additional;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {
    private ICalculator iCalculator;
    private long countOperation = 0;
    public CalculatorWithCounterAutoCompositeInterface(ICalculator calc){
        this.iCalculator = calc;
    }
    private void incrementCountOperation() {
        this.countOperation++;
    }
    public double plus(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.plus(a,b);
    }
    public double minus(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.minus(a,b);
    }
     public double mult(double a, double b) {
         incrementCountOperation();
        return this.iCalculator.mult(a, b);
    }
    public double div(double a, double b) {
        incrementCountOperation();
        return this.iCalculator.div(a, b);
    }
    public double exp(double a, int n) {
        incrementCountOperation();
        return this.iCalculator.exp(a, n);
    }
    public double modul(double a) {
        incrementCountOperation();
        return this.iCalculator.modul(a);
    }
    public double square(double a) {
        incrementCountOperation();
        return this.iCalculator.square(a);
    }
    public long getCountOperation(){
        return this.countOperation;
    }
}
