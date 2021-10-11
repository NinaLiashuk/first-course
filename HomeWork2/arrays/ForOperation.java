package HomeWork2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public void allElements(int[] arr) {             // Вывод в консоль всех элементов массива
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {      // Вывод в консоль каждый второй элемент массива
        for (int j = 0; j < arr.length - 1; j++) {
            j++;
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }

    @Override
    public void reversElements(int[] arr) {          // Вывод в консоль всех элементов массива в обратном порядке
        for (int j = (arr.length - 1); j >= 0; j--) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }
}
