package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

          for(int  i = a;i < b;i++){
               if(i % 5 == 0 && i % 10 != 0){
                   System.out.println(i + " ");
               }
          }
    }
}

