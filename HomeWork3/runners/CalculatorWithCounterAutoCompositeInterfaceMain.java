package HomeWork3.runners;

import HomeWork3.calks.additional.CalculatorWithCounterAutoCompositeInterface;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    private static HomeWork3.calks.api.ICalculator ICalculator;

    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calculator = new CalculatorWithCounterAutoCompositeInterface(ICalculator);
        // 4.1 + 15 * 7 +(28 / 5) ^ 2
        System.out.println(calculator.plus(4.1, calculator.plus(calculator.mult(15, 7),
                calculator.exp(calculator.div(28, 5.0), 2))));   // 140.46
        System.out.println("Колличество использования калькулятора = " + calculator.getCountOperation());
    }
}


