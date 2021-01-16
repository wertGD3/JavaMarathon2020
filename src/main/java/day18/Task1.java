package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] number = {23, 56, 2345, 89, 65};
        System.out.println(sum(number, 0));
    }

    public static int sum(int[] number, int i) {
        if (i == number.length)
            return 0;
        return number[i] + sum(number, i + 1);
    }
}
