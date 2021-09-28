package HomeWork3.runners;

import HomeWork3.calks.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calks.additional.CalculatorWithMemoryDecorator;
import HomeWork3.calks.api.ICalculator;
import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

        public static void main(String[] args) {

        ICalculator iCalculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator
                (new CalculatorWithMathExtends()));
        System.out.println(iCalculator.plus(4.1, iCalculator.plus(iCalculator.mult(15, 7),
                iCalculator.exp(iCalculator.div(28, 5.0), 2))));

        iCalculator.plus(4.1, iCalculator.mult(15,7));
        System.out.println(((CalculatorWithCounterAutoDecorator) iCalculator).getResult());
        System.out.println(iCalculator instanceof CalculatorWithCounterAutoDecorator);
        System.out.println(((CalculatorWithCounterAutoDecorator) iCalculator).getiCalculator());


    }
}
// нужно доработать. Считает математику и количество калькулятора, но не выдает память



