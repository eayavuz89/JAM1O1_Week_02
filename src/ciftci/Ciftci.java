package ciftci;

import ciftlik.Inek;
import ciftlik.Tavuk;

import java.util.Arrays;


public class Ciftci {
    public static void main(String[] args){
        Tavuk[] tavuks = new Tavuk[] {
                new Tavuk(),
                new Tavuk("Lili"),
                new Tavuk("Po"),
                new Tavuk()
        };

        Inek[] ineks = new Inek[] {
                new Inek("Benekli"),
                new Inek(),
                new Inek("Sarıkız"),
                new Inek()
        };

        System.out.println("Inekler : ");
        for (Inek inek:ineks)
            System.out.println(inek.getName());

        System.out.println("\n\nTavuklar : ");
        for (Tavuk tavuk:tavuks)
            System.out.println(tavuk.getName());


    }
}
