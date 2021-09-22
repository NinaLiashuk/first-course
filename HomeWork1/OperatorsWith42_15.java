package HomeWork1;

public class OperatorsWith42_15 {

    public static void main(String[] args) {
      int a = 42;
      int b = 15;

      System.out.print("Двоичный код числа 42: ");
      System.out.println(Integer.toBinaryString(a));     //Двоичный код 00101010

      System.out.print("Двоичный код числа 15: ");
      System.out.println(Integer.toBinaryString(b));    // Двоичный код 00001111

      System.out.println("Результат бинарного оператора ~ числа 1111 ");
      System.out.println(Integer.toBinaryString (~b));

      System.out.print("Результат бинарного оператора AND ");
      System.out.println(Integer.toBinaryString(a & b));

      System.out.print("Результат бинарного оператора OR ");
      System.out.println(Integer.toBinaryString(a | b));

      System.out.print("Результат бинарного оператора XOR ");
      System.out.println(Integer.toBinaryString(a ^ b));

      System.out.print("Сдвиг числа 101010 вправо на 2 бита ");
      System.out.println(Integer.toBinaryString(a >> 2));

      System.out.print("Сдвиг числа 101010 вправо на 15 бит ");
      System.out.println(Integer.toBinaryString(a >> 15));

      System.out.print("Сдвиг числа 101010 влево на 15 бит ");
      System.out.println(Integer.toBinaryString(a << 15));

      System.out.print("Нулевой оператор сдвига вправо: число 101010 на 4 бита ");
      System.out.println(Integer.toBinaryString(a >>> 4));
    }
}



