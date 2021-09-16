package HomeWork2.Loops;

import java.util.Scanner;
import java.util.Arrays;  //throw NumberFormatException.forInputString(s)
import java.math.BigInteger;

//Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
public class Zhikl1_1_2 {
    public static void main(String[] args) throws ArithmeticException {
        int i = 1;
        int f = 1;
        int a = Integer.parseInt(args[0]);
        System.out.println(Arrays.toString(args));

        while (i <= a) {
            f = f * i;
            if (i < a)
                System.out.print(i + " * ");
            i++;
            if (i == a)
                System.out.print(i);
        }
         if (f > Integer.MAX_VALUE || f < Integer.MIN_VALUE)
                System.out.println("  Результат слишком большой");
             else System.out.println(" = " + f);
        }
    }
