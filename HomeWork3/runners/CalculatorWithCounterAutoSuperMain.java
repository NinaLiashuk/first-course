package HomeWork3.runners;

import HomeWork3.calks.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calk6 = new CalculatorWithCounterAutoSuper();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(calk6.plus(4.1, calk6.plus(calk6.mult(15,7),
                calk6.exp(calk6.div(28,5.0), 2))));
        System.out.println("Колличество использований калькулятора : " + calk6.getCountOperation());
    }
}
