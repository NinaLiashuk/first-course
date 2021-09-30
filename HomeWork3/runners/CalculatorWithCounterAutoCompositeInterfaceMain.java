package HomeWork3.runners;

import HomeWork3.calks.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calks.simple.CalculatorWithMathCopy;
import HomeWork3.calks.simple.CalculatorWithMathExtends;
import HomeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface calculator1 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoCompositeInterface calculator2 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoCompositeInterface calculator3 = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());
        // 4.1 + 15 * 7 +(28 / 5) ^ 2
        System.out.println(calculator1.plus(4.1, calculator1.plus(calculator1.mult(15, 7),
                calculator1.exp(calculator1.div(28, 5.0), 2))));   // 140.46
        System.out.println("Колличество использования калькулятора = " + calculator1.getCountOperation());

        System.out.println(calculator2.plus(4.1, calculator2.plus(calculator2.mult(15, 7),
                calculator2.exp(calculator2.div(28, 5.0), 2))));   // 140.46
        System.out.println("Колличество использования калькулятора = " + calculator2.getCountOperation());

        System.out.println(calculator3.plus(4.1, calculator3.plus(calculator3.mult(15, 7),
                calculator3.exp(calculator3.div(28, 5.0), 2))));   // 140.46
        System.out.println("Колличество использования калькулятора = " + calculator3.getCountOperation());
    }
}


