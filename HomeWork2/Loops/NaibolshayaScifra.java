package HomeWork2.Loops;
// С клавы вводится число
//Найти его наибольшую цифру

import java.util.Scanner;

public class NaibolshayaScifra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        int i;
        i = n % 10;
        n = n / 10;

        while (n > 0) {
            if (n % 10 > i)
                i = n % 10;
                n = n / 10;
        }
            System.out.print("Наибольшее число " + i);
        }
    }          //Сделано