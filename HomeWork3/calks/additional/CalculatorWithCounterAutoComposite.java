package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathCopy;
import HomeWork3.calks.simple.CalculatorWithMathExtends;
import HomeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithOperator calculator1;
    CalculatorWithMathCopy calculator2;
    CalculatorWithMathExtends calculator3;
    int CountOperation = 0;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {this.calculator1 = calculator; }
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }
    public double plus (double a, double b){
        double result = 0;
        if(calculator1 != null){
            result = calculator1.plus(a,b);
        }
        else if(calculator2 != null){
            result = calculator2.plus(a, b);
        }
        else if(calculator3 != null){
            result = calculator3.plus(a, b);
        }
        CountOperation++;
        return result;
    }
    public double minus (double a, double b){
        double result = 0;
        if(calculator1 != null){
            result = calculator1.minus(a,b);
        }
        else if(calculator2 != null){
            result = calculator2.minus(a, b);
        }
        else if(calculator3 != null){
            result = calculator3.minus(a, b);
        }
        CountOperation++;
        return result;
    }
    public double mult (double a, double b) {
        double result = 0;
        if (calculator1 != null) {
            result = calculator1.mult(a, b);
        } else if (calculator2 != null) {
            result = calculator2.mult(a, b);
        } else if (calculator3 != null) {
            result = calculator3.mult(a, b);
        }
        CountOperation++;
        return result;
    }
    public double div (double a, double b) {
        double result = 0;
        if (calculator1 != null) {
            result = calculator1.div(a, b);
        } else if (calculator2 != null) {
            result = calculator2.div(a, b);
        } else if (calculator3 != null) {
            result = calculator3.div(a, b);
        }
        CountOperation++;
        return result;
    }
    public double modul (double a) {
        double result = 0;
        if (calculator1 != null) {
            result = calculator1.modul(a);
        } else if (calculator2 != null) {
            result = calculator2.modul(a);
        } else if (calculator3 != null) {
            result = calculator3.modul(a);
        }
        CountOperation++;
        return result;
    }
    public double exp (double a, int b) {
        double result = 0;
        if (calculator1 != null) {
            result = calculator1.exp(a, b);
        } else if (calculator2 != null) {
            result = calculator2.exp(a, b);
        } else if (calculator3 != null) {
            result = calculator3.exp(a, b);
        }
        CountOperation++;
        return result;
    }
    public double square (double a) {
        double result = 0;
        if (calculator1 != null) {
            result = calculator1.square(a);
        } else if (calculator2 != null) {
            result = calculator2.square(a);
        } else if (calculator3 != null) {
            result = calculator3.square(a);
        }
        CountOperation++;
        return result;
    }
    public long getCountOperation(){
        return this.CountOperation;
    }
}


