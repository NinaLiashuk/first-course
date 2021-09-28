package HomeWork3.runners;     // 4.1 + 15 * 7 + (28 / 5) ^ 2

import HomeWork3.calks.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory();
        calculator.plus(4.1, calculator.mult(15,7));   // 4.1 + 15 * 7
        calculator.getResult();  // 109.1
        calculator.plus(calculator.getResult(), calculator.exp(calculator.div(28, 5), 2)); // 4.1 + 15*7 + (28/5)^2
        calculator.getResult();
        System.out.println(calculator.getResult());  //140.46
    }
}

