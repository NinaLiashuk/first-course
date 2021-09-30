package HomeWork3.calks.additional;

import HomeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation = 0;
    public void incrementCountOperation(){       //должен увеличивать внутренний счётчик в калькуляторе
        this.countOperation ++;
    }
    public long getCountOperation(){            //должен возвращать количество использований данного калькулятора
        return this.countOperation;
    }
}
