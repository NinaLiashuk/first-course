package HomeWork3.runners;         // 4.1 + 15 * 7 + (28 / 5) ^ 2

import HomeWork3.calks.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();
        double a = calc4.mult(15,7);
        calc4.incrementCountOperation();
        double b = calc4.div(28,5.0);
        calc4.incrementCountOperation();
        double c = calc4.exp(b,2);
        calc4.incrementCountOperation();
        double d = calc4.plus(4.1,a);
        calc4.incrementCountOperation();
        double e = calc4.plus(d,c);
        calc4.incrementCountOperation();
        System.out.println("Калькулятор использовали : " + calc4.getCountOperation() + " раз ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + e);
    }
}
