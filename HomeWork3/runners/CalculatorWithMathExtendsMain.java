package HomeWork3.runners;

import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(calc3.plus(4.1, calc3.plus(calc3.mult(15,7),
                calc3.exp(calc3.div(28,5), 2))));    // 140.46
    }
}
