package HomeWork1;

import java.util.Scanner;

public class OperatorsNamesSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.nextLine();

        switch (name) {
           case ("Вася"):
               System.out.println("Привет!");
               System.out.println("Я тебя так долго ждал");
           break;
           case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
           break;
           default:
               System.out.println("Добрый день, а вы кто?");
        }
    }
}
