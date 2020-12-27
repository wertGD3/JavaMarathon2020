package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random j = new Random();
        int[][]bigar =new int[12][8];

        for(int i=0;i< bigar.length;i++){
            for(int p=0;p<bigar[i].length;p++){
                j.nextInt(50);
            }
        }
        System.out.println(Arrays.toString(bigar));

    }
}
