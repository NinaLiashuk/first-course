package HomeWork2.arrays;

//В массиве, содержащем положительные и отрицательные числа, найти сумму четных положительных чисел

public class  ZadachaMassiv1 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {5 , 12, -1, 4, -6, 13, 11, 0, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
            System.out.println(sum);
    }
}

