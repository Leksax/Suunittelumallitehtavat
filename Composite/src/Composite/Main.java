package Composite;

public class Main {

    public static void main(String[] args){
        int totalhinta = 0;

        Laiteosa muistipiiri = new Laiteosa("Muistipiiri", 150);
        Laiteosa prosessori = new Laiteosa("Prosessori", 100);
        Laiteosa verkkokortti = new Laiteosa("Verkkokortti", 50);
        Laiteosa naytonohjain = new Laiteosa("Naytonohjain", 300);
        Koostekomponentti emolevy = new Koostekomponentti("Emolevy", 500);
        Koostekomponentti kotelo = new Koostekomponentti("Kotelo", 250);

        totalhinta = totalhinta + muistipiiri.getHinta();
        totalhinta = totalhinta + prosessori.getHinta();
        totalhinta = totalhinta + verkkokortti.getHinta();
        totalhinta = totalhinta + naytonohjain.getHinta();
        totalhinta = totalhinta + emolevy.getHinta();
        totalhinta = totalhinta + kotelo.getHinta();

        System.out.println("Tietokoneen osat: ");
        muistipiiri.print();
        prosessori.print();
        verkkokortti.print();
        naytonohjain.print();
        emolevy.print();
        kotelo.print();
        System.out.println("Kokonaishinta: " + totalhinta);
    }
}
