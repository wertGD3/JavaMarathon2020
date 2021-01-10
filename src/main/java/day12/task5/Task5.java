package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members3 = new ArrayList<>();
        members3.add(new MusicArtist("Дубинин Виталий",34));
        members3.add(new MusicArtist("Холстинин Владимир",54));
        members3.add(new MusicArtist("Попов Сергей",78));
        members3.add(new MusicArtist("Житняков Михаил",65));
        members3.add(new MusicArtist("Удалов Максим",45));

        MusicBand band4 = new MusicBand("Ария",1985,members3);

        List<MusicArtist>members2 = new ArrayList<>();
        members2.add(new MusicArtist("Ларс Ульрих",54));
        members2.add(new MusicArtist("Джеймс Хэтвилд",66));
        members2.add(new MusicArtist("Кирк Хэмметт",43));
        members2.add(new MusicArtist("Роберт Трухильо",55));

        MusicBand band5 = new MusicBand("Metallica",1981,members2);

        band4.printMembers();
        band5.printMembers();

        MusicBand.transferMembers(band4,band5);

        band4.getMembers();
        band5.getMembers();


    }
}
class MusicArtist{
   private String name;
   private int age;

   public MusicArtist(String name,int age){
       this.name = name;
       this.age = age;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

