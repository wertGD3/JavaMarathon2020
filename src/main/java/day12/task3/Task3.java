package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        MusicBand musicBand_1 = new MusicBand("Imfact", 2016);
        MusicBand musicBand_2 = new MusicBand("Mafia Honey", 2016);
        MusicBand musicBand_3 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand_4 = new MusicBand("Kerosin", 2008);
        MusicBand musicBand_5 = new MusicBand("Gimmel", 2002);
        MusicBand musicBand_6 = new MusicBand("Hard-Fi", 2002);
        MusicBand musicBand_7 = new MusicBand("Амега", 1998);
        MusicBand musicBand_8 = new MusicBand("Иван Купала", 1998);
        MusicBand musicBand_9 = new MusicBand("Flow", 1993);
        MusicBand musicBand_10 = new MusicBand("Iris", 1993);

        List<MusicBand> muslist = new ArrayList<>();
        muslist.add(musicBand_1);
        muslist.add(musicBand_2);
        muslist.add(musicBand_3);
        muslist.add(musicBand_4);
        muslist.add(musicBand_5);
        muslist.add(musicBand_6);
        muslist.add(musicBand_7);
        muslist.add(musicBand_8);
        muslist.add(musicBand_9);
        muslist.add(musicBand_10);

        System.out.println(muslist);

        Collections.shuffle(muslist);

        System.out.println(muslist);
        
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : muslist) {
            if (band.getYear() > 2000)
                groupsAfter2000.add(band);

        }
        System.out.println(groupsAfter2000);
    }

}

class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
