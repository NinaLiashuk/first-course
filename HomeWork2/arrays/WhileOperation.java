package HomeWork2.arrays;

// во всех методах можно использовать только while

public class WhileOperation implements IArraysOperation {
    @Override
    public void allElements(int[] arr) {          // Вывод в консоль всех элементов массива
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + "  ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {   // Вывод в консоль каждый второй элемент массива
        int i = 0;
        while (i < arr.length - 1) {
            i++;
            System.out.print((arr[i]) + "  ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void reversElements(int[] arr) {      // Вывод в консоль всех элементов массива в обратном порядке
        int n = arr.length;
        while (n > 0) {
            System.out.print(arr[n - 1] + "  ");
            n--;
        }
        System.out.println();
    }
}
