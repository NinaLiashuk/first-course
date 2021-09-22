package HomeWork1;

import java.util.Scanner;

public class ZadachaNechetnoeChislo {

    //Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число.
    // Вводим вручную два числа
    // Проверяем, если оба четные или оба нечетные, увеличиваем первое число на единицу

    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи два числа");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a%2 == 1 && b%2 ==1 || a%2 == 0 && b%2 == 0) {
            a++;
            System.out.println("Число a = " + a);
            System.out.println("Число b = " + b);
        }
        if (a%2 != 0) {
            System.out.println("Число " + a + " нечетное");
        }
        else {
            System.out.println("Число " + b + " нечетное");
        }
    }
}
