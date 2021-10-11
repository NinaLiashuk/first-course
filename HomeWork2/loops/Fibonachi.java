package HomeWork2.loops;
// С клавы вводится число
//Найти его наибольшую цифру

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел из ряда будем выводить?");
        int n = scan.nextInt();
        int f1 = 1;
        int f2 = 2;
        int b;
        System.out.print(" " + f1 + " ");
        System.out.print(" " + f2 + " ");

        for (int i = 3; i <= n; i ++) {
            System.out.print(" " + (f1 + f2) + " ");
            b = f1;
            f1 = f2;
            f2 = b + f1;
        }
    }
}