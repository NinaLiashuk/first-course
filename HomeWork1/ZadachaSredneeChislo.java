package HomeWork1;

import java.util.Scanner;

public class ZadachaSredneeChislo {

    //Вводятся три разных числа.
    // Найти, какое из них является средним (больше одного, но меньше другого).


    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a<c || a>c && a<b){
            System.out.println("Число "+ a + " среднее");
        }
else if (b>a && b<c || b<a && b>c){
    System.out.println("Число " + b+ " среднее");
        }
else {
    System.out.println("Число " + c+ " среднее");
        }
    }
}
