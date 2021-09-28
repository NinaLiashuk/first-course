package HomeWork3.runners;

import HomeWork3.calks.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calk2 = new CalculatorWithMathCopy();
        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(calk2.plus(4.1, calk2.plus(calk2.mult(15, 7),
                calk2.exp(calk2.div(28, 5), 2 ))));   // 140.46
    }
}
