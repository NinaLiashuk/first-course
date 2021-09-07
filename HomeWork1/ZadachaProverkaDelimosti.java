package HomeWork1;

import java.util.Scanner;

public class ZadachaProverkaDelimosti {

    //Вводятся два целых числа не равных нулю
    //Проверить делится ли первое на второе.
    // Вывести на экран сообщение об этом, а также остаток (если он есть) и частное


    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a / b;
        int d = a % b;

        System.out.println("Делим " + a + " на " + b);

        if (a % b == 0){
            System.out.println("Делится без остатка. Ответ " + c);
        }

        else {
            System.out.println("Ответ " + c + " с остатком равным " + d);
        }
    }
}
