package HomeWork2.Loops;
// С клавы вводится число
//Посчитать его четные и нечетные цифры

import java.util.Scanner;

public class ChetINechet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        int i;
        int count1 = 0;
        int count2 = 0;

        while (n > 0) {
            i = n % 10;
            n = n / 10;
                if (i % 2 == 0)
                    count1++;
                if (i % 2 != 0)
                    count2++;
    }
        System.out.println("В числе " + count2 + " нечетных цифр ");
        System.out.println("В числе " + count1 + " четных цифр ");}
}

       //Сделано