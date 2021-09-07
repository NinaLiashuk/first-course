package HomeWork1;

import java.util.Scanner;

public class ZadachaBaityKilobaity {

    //Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора.
    //Указать направление перевода.
    //Если выбран перевод в байты (b), то надо умножить число на 1024.
    //Если выбран перевод в килобайты (k), то надо разделить число на 1024.


    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи любое число");
        int a = scan.nextInt();
        System.out.println("Выберите байт (b) или килобайт (k) для перевода ");
        String ss = scan.next();
String b;
String k;

        switch (ss){
            case "b" :
                double c = a * 1024;
                System.out.println(c);
            break;

            case "k" :
                double d = a / 1024.0;
                System.out.println(d);
            break;

            default:
                System.out.println("Направление перевода не выбрано");
        }
        }
}
