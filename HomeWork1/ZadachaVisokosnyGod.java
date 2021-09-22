package HomeWork1;

import java.util.Scanner;

public class ZadachaVisokosnyGod {

    //Является ли год високосным
    //Если делится на 4 без остатка, то является високосным
    //Если делится на 100, но при этом если не делится на 400, то не является

    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scan.nextInt();

        if (a % 4 != 0){
            System.out.println("Год невисокосный");
        }
        else if (a % 100 == 0 && a % 400 != 0){
            System.out.println("Год невисокосный");
        }
        else {
            System.out.println("Год високосный");
        }
    }
}
