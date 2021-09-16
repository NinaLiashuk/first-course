package HomeWork2.Loops;
//вероятности выпадения четных чисел на выборке не меньше 1000 случайных чисел
public class GeneratorChisel {
    public static void main(String[] args) {

       int count = 0;
       for (int i = 1; i <= 1000; i++) {
           int a = (int) (Math.random() * 100);
           if (a % 2 == 0) {
               count++;
           }
       }
       System.out.println(count);
       }
    }

