package HomeWork2.Loops;

import java.util.Scanner;

public class VozvedenieStepen_1_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double a = scan.nextDouble();
        System.out.println("Введите степень");
        int n = scan.nextInt();
        double f = 1;
        int count;

        for (count = 1; count <= n; count++){
            f = f * a;
        }
        System.out.println(a + " ^ " + n + " = " + f);
    }
}
// Сделано