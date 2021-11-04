package Composite;

import java.util.ArrayList;
import java.util.List;

public class Laiteosa implements Tietokone{

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
  public Laiteosa(String nimi, int hinta){
        this.nimi = nimi;
        this.hinta = hinta;
  }
  @Override
  public void addLaiteosa(Tietokone Laiteosat){

  }

  @Override
  public void print(){
        System.out.println("Nimi: " + getNimi());
        System.out.println("Hinta:" + getHinta());
      System.out.println("Laiteosat :");
      for (Tietokone koostekomponentti: koostekomponentit){
          System.out.println("Nimi : " + koostekomponentti.getNimi());
      }

  }
  private List<Tietokone> koostekomponentit = new ArrayList<>();
    public void addKoostekomponentti(Tietokone koostekomponentti){
        koostekomponentit.add(koostekomponentti);
    }
}

