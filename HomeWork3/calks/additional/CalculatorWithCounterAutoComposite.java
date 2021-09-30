package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathCopy;
import HomeWork3.calks.simple.CalculatorWithMathExtends;
import HomeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithOperator calculator1;
    private final CalculatorWithMathCopy calculator2;
    private final CalculatorWithMathExtends calculator3;
    private long countOperation = 0;

    private void incrementCountOperation() {
        this.countOperation++;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
        this.calculator2 = null;
        this.calculator3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculator1 = null;
        this.calculator2 = calculator;
        this.calculator3 = null;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.calculator1 = null;
        this.calculator2 = null;
        this.calculator3 = calculator;
    }

    public double plus(double a, double b) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.plus(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.plus(a, b);
        } else {
            return this.calculator3.plus(a, b);
        }
    }

    public double minus (double a, double b){
        incrementCountOperation();
        if(this.calculator1 != null){
            return this.calculator1.minus(a,b);
        }
        else if(this.calculator2 != null){
            return this.calculator2.minus(a, b);
        }
        else {
            return this.calculator3.minus(a, b);
        }
    }
    public double mult (double a, double b) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.mult(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.mult(a, b);
        } else {
            return this.calculator3.mult(a, b);
        }
    }
    public double div (double a, double b) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.div(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.div(a, b);
        } else {
            return this.calculator3.div(a, b);
        }
    }
    public double modul (double a) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.modul(a);
        } else if (this.calculator2 != null) {
            return this.calculator2.modul(a);
        } else {
            return this.calculator3.modul(a);
        }
    }
    public double exp (double a, int b) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.exp(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.exp(a, b);
        } else {
            return this.calculator3.exp(a, b);
        }
    }
    public double square (double a) {
        incrementCountOperation();
        if (this.calculator1 != null) {
            return this.calculator1.square(a);
        } else if (this.calculator2 != null) {
            return this.calculator2.square(a);
        } else {
            return this.calculator3.square(a);
        }
    }
    public long getCountOperation(){
        return this.countOperation;
    }
}


