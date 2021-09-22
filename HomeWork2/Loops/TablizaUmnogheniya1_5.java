package HomeWork2.Loops;
// Вывести таблицу умножения на консоль
public class TablizaUmnogheniya1_5 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        while (j <= 10) {
            for (i = 2; i <= 5; i++)
            System.out.printf("%8s","  " + i + " х " + j + " = " + i * j, '\t');
            j++;
            System.out.println();
        }
        System.out.println();
        int a = 1;
        int b = 1;
        while (b <= 10) {
            for (a = 6; a < 10; a++)
                System.out.print("  " + a + " х " + b + " = " + a * b);
                b++;
                System.out.println();
        }
    }
}



