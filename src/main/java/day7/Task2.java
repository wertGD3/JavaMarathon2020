package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player pl1 = new Player(95);
        Player pl2 = new Player(98);
        Player pl3 = new Player(93);
        Player pl4 = new Player(92);
        Player pl5 = new Player(91);
        Player pl6 = new Player(97);
        Player pl7 = new Player(98);
    }
}

class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int a) {
        stamina = a;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные,еще есть " + (6 - countPlayers) + " свободных мест");

        } else System.out.println("Мест в командах больше нет");
    }
}

