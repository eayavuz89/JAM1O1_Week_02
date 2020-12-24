package ciftlik;

public class Inek {
    public static int ToplamSayi = 0  ;
    private String name;

    public Inek(){
        Inek.ToplamSayi++;
        this.name = "Inek" + Inek.ToplamSayi;
    }
    public Inek(String name){
        Inek.ToplamSayi++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
