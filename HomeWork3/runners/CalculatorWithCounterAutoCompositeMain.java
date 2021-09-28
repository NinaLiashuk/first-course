package HomeWork3.runners;         // 4.1 + 15 * 7 + (28 / 5) ^ 2

import HomeWork3.calks.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calks.simple.CalculatorWithMathCopy;
import HomeWork3.calks.simple.CalculatorWithMathExtends;
import HomeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {

    public static void main(String[] args) {
       CalculatorWithCounterAutoComposite cal = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
       CalculatorWithCounterAutoComposite cal2 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
       CalculatorWithCounterAutoComposite cal3 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

       System.out.println(cal.plus(4.1, cal.plus(cal.mult(15,7), cal.exp(cal.div(28,5.0),2))));
       System.out.println(cal2.plus(4.1, cal2.plus(cal.mult(15,7), cal2.exp(cal2.div(28,5.0),2))));
       System.out.println(cal3.plus(4.1, cal3.plus(cal.mult(15,7), cal3.exp(cal3.div(28,5.0),2))));
    }
}
