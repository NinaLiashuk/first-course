package HomeWork3.calks.simple;

import HomeWork3.calks.api.ICalculator;

public class CalculatorWithMathExtends  extends CalculatorWithOperator implements ICalculator {
    @Override
    public double exp(double a, int n){
        return Math.pow(a, n);
    }
    @Override
    public  double modul (double a) {
        return Math.abs(a);
    }
    @Override
    public double square(double a) {
        return Math.sqrt(a);
    }
}

