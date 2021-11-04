package Composite;

import java.util.ArrayList;
import java.util.List;

public class Koostekomponentti implements Tietokone{

    private String nimi;
    private int hinta;

    @Override
    public String getNimi(){
        return nimi;
    }
    @Override
    public int getHinta(){
        return hinta;
    }

    public Koostekomponentti(String nimi, int hinta){
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public void print(){
        System.out.println("Nimi: " + getNimi());
        System.out.println("Hinta: " + getHinta());
        System.out.println("Laiteosat :");
        for (Tietokone laiteosa: laiteosat){
            System.out.println("Nimi : " + laiteosa.getNimi());
        }
    }

    private List<Tietokone> laiteosat = new ArrayList<>();
    public void addLaiteosa(Tietokone laiteosa){
        laiteosat.add(laiteosa);
    }


}
