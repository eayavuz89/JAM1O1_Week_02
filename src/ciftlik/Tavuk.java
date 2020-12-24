package ciftlik;

public class Tavuk {
    public static int ToplamSayi = 0 ;
    private String name;


    public Tavuk(){
        Tavuk.ToplamSayi++;
        this.name = "Tavuk" + Tavuk.ToplamSayi;
    }

    public Tavuk(String name ){
        Tavuk.ToplamSayi++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
