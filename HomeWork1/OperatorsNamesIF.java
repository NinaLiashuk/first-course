package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorsNamesIF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}