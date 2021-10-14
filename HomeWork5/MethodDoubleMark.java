package HomeWork5;

import java.util.concurrent.ThreadLocalRandom;

// метод для вывода рандомного дробного числа от 0 до 10 с двумя знаками после запятой

public class MethodDoubleMark {

    public static double mark() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        double mark = random.nextDouble(0.0, 10.0);
        return Math.round(mark * 100.0) / 100.0;
    }
}






