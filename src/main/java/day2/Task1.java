package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r <= 4 && r >1){
            System.out.println("Малоэтажный дом");
        }else if(r <= 8 && r >= 5){
            System.out.println("Среднеэтажный дом");
        }else if(r >= 9){
            System.out.println("Многоэтажный дом");
        }else if(r < 0){
            System.out.println("Ошибка ввода");
        }
    }
}
