package HomeWork2.Loops;

import java.util.Scanner;

//Вывести на экран ряд натуральных чисел с некоторым шагом
// Min, max число и шаг вводим в консоль сами

public class ChislaShag {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int a = scan.nextInt();
        System.out.println("Введите максимальное число");
        int b = scan.nextInt();
        System.out.println("Введите шаг");
        int c = scan.nextInt();
        int i;

        while (a < b) {
            System.out.print("  " + a + "  ");
            a = a + c;
        }
        if ((a + c) > b)
            return;
    }
}
              //Сделано