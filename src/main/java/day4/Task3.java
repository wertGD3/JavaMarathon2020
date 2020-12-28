package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random j = new Random();
        int[][] bigar = new int[12][8];

        for (int i = 0; i < bigar.length; i++) {
            for (int p = 0; p < bigar[i].length; p++) {
                bigar[i][p] = j.nextInt(50);
            }
        }
        int max = 0;
        int maxI = 0;
        for (int i = 0; i < bigar.length; i++) {
            int sum = 0;
                for (int p = 0; p < bigar[i].length; p++) {
                    sum += bigar[i][p];
                }
                if (sum >= max) {
                    max = sum;
                    maxI = i;
                }
            }
            System.out.println(maxI);
        }
    }
