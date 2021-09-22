package HomeWork1;

import java.util.Scanner;

public class ZadachaBukvaIliSimvol {

    //Вводится целое число, обозначающее код символа по таблице ASCII.
    // Определить, это код английской буквы или какой-либо иной символ.

    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи любое число");
        int a = scan.nextInt();

        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
            System.out.println("Это английская буква");
        } else {
            System.out.println("Это другой символ");
        }
    }
}
