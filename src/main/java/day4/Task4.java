package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random f = new Random();
        for (int i = 0; i < mas.length; i++)
            mas[i] = f.nextInt();
        int maxS = 0;
        int maxSI = 0;
        for (int i = 0; i < mas.length - 2; i++) {
            int sum = 0;
            {
                for (int j = i; j < i + 3; j++) {
                    sum += mas[i];
                }
                if (sum > maxS) {
                    maxS = sum;
                    maxSI = i;
                }
            }
        }
        System.out.println(maxS);
        System.out.println(maxSI);
    }
}
