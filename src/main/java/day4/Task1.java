package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        Random f = new Random();

        int t = h.nextInt();
        int[] ar = new int[t];
        int sum = 0;
        int sum8 = 0;
        int sum1 = 0;
        int sumCH = 0;
        int sumNECH = 0;

        for (int i = 0; i < t; i++) {
            ar[i] = f.nextInt(50);
            if (ar[i] > 8) {
                sum8++;
            } else if (ar[i] == 1) {
                sum1++;
            }
            if (ar[i] % 2 == 0) {
                sumCH++;
            } else if (ar[i] % 2 != 0) {
                sumNECH++;
            }
            sum += ar[i];
        }

        System.out.println();
        System.out.println("Длина массива: " + t);
        System.out.println("Количество чисел больше 8: " + sum8);
        System.out.println("Количество чисел равных 1: " + sum1);
        System.out.println("Количество четных чисел: " + sumCH);
        System.out.println("Количество нечетных чисел: " + sumNECH);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

