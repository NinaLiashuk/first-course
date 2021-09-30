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

        iCalculator.plus(4.1, iCalculator.mult(15, 7));

        System.out.println(iCalculator instanceof CalculatorWithCounterAutoDecorator);
             if (iCalculator instanceof CalculatorWithCounterAutoDecorator) {
                  CalculatorWithCounterAutoDecorator calcCount = (CalculatorWithCounterAutoDecorator) iCalculator;
                  System.out.println("Количество использований калькулятора = " + calcCount.getCountCalculator());
                  iCalculator = ((CalculatorWithCounterAutoDecorator)iCalculator).getiCalculator();   // все задание сделала сама, кроме вот ЭТОЙ
                }                                                                                     //строки. Это Миша подсказал
        System.out.println(iCalculator instanceof CalculatorWithMemoryDecorator);
             if (iCalculator instanceof CalculatorWithMemoryDecorator) {
                  CalculatorWithMemoryDecorator calcMemory = (CalculatorWithMemoryDecorator) iCalculator;
                  System.out.println("Результат последней операции = " + calcMemory.getMemory());
             }
    }
}




