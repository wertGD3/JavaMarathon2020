package day11.task2;

import java.time.chrono.HijrahEra;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }

    }
}

abstract class Hero implements PhysAttac {
    protected static final int HEALTH_MIN = 0;
    protected static final int HEALTH_MAX = 100;

    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double atakUr = physAtt * (1 - hero.physDef);
        if (hero.health - atakUr < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health -= atakUr;
        }

    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}

class Warrior extends Hero implements PhysAttac {
    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Paladin extends Hero implements Healer {
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 20;
    }

    public void healHimself() {
        if (health + 25 > HEALTH_MAX) {
            health = 100;
        } else {
            health += 25;
        }
    }

    public void healTeammate(Hero hero) {
        if (hero.health + 10 > HEALTH_MAX) {
            hero.health = 100;
        } else {
            hero.health += 10;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Magician extends Hero implements PhysAttac, MagicAttac {
    private int magicAtt = 20;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double atakUr = magicAtt * (1 - hero.magicDef);
        if (hero.health - atakUr < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health -= atakUr;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Shaman extends Hero implements Healer, MagicAttac {
    private int magicAtt = 15;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;

    }


    public void healHimself() {
        if (health + 50 > HEALTH_MAX) {
            health = 100;
        } else {
            health += 50;
        }
    }

    public void healTeammate(Hero hero) {
        if (hero.health + 30 > HEALTH_MAX) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }
    }

    public void magicalAttack(Hero hero) {
        double atakUr = magicAtt * (1 - hero.magicDef);
        if (hero.health - atakUr < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health -= atakUr;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

interface Healer {
    void healHimself();

    void healTeammate(Hero hero);
}

interface PhysAttac {
    void physicalAttack(Hero hero);
}

interface MagicAttac {
    void magicalAttack(Hero hero);

}
