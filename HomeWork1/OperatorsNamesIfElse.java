package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorsNamesIfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");

        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
