package HomeWork1;

public class OperatorsWithMinus42_15 {

    public static void main(String[] args) {
      int a = -42;
      int b = -15;

      System.out.print("Двоичный код числа -42: ");
      System.out.println(Integer.toBinaryString(a));     //Двоичный код 11010110

      System.out.print("Двоичный код числа -15: ");
      System.out.println(Integer.toBinaryString(b));    // Двоичный код 11110001

      System.out.print("Результат бинарного оператора ~ числа 15: ");
      System.out.println(Integer.toBinaryString (~b));

      System.out.print("Результат бинарного оператора AND ");
      System.out.println(Integer.toBinaryString(a & b));

      System.out.print("Результат бинарного оператора OR ");
      System.out.println(Integer.toBinaryString(a | b));

      System.out.print("Результат бинарного оператора XOR ");
      System.out.println(Integer.toBinaryString(a ^ b));

      System.out.print("Сдвиг числа 42 вправо на 15 бит ");
      System.out.println(Integer.toBinaryString(a >> 15));

      System.out.print("Сдвиг числа 42 влево на 15 бит ");
      System.out.println(Integer.toBinaryString(a << 15));

      System.out.print("Нулевой оператор сдвига вправо: число 42 на 4 бита ");
      System.out.println(Integer.toBinaryString(a >>> 4));
    }
}



