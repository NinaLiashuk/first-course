package HomeWork2.Loops;

import java.util.Scanner;

//Вывести на экран ряд натуральных чисел с некоторым шагом
// Min, max число и шаг вводим в консоль сами

public class PerevorotChisla {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        int i;

        while (a > 0){
            i = a % 10;
            a = a / 10;
            System.out.print(i);
        }
    }
    }
// Сделано