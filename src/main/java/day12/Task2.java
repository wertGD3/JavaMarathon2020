package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 350; i++) {
            if (i <= 30 && i % 2 == 0) {
                list.add(i);
            } else if (i >= 300 && i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
