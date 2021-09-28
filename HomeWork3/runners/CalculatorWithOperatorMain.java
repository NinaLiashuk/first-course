package HomeWork3.runners;

import HomeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(calc1.plus(4.1, calc1.plus(calc1.mult(15, 7),
                calc1.exp(calc1.div(28, 5), 2 ))));   // 140.46
    }
}



