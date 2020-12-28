package day4;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[]arr = new int[100];
        Random g = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            arr[i] = g.nextInt(10000);

        if(arr[i] > max){
            max = arr[i];
        }else if(arr[i] < min){
            min = arr[i];
        }if(arr[i] % 10==0){
            count++;
            sum+=arr[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количетво элементов массива,оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива,оканчивающихся на 0: " + sum);

    }
}
