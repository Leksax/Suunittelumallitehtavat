public class Main {
    public static void main(String[] args){
       double palkka = 1500.50;
       System.out.println("Palkkasi on " + palkka);

       System.out.println("Palkkaasi korotetaan 1,5%");
       palkanKorotus palkankorotus = new esiMies();
       double uusiPalkka = palkankorotus.palkanKorotus(palkka, 0.015);
       System.out.println("Palkkasi on " + uusiPalkka);

       System.out.println("Palkkaasi korotetaan 4%");
       uusiPalkka = palkankorotus.palkanKorotus(uusiPalkka, 0.04);
       System.out.println("Palkkasi on " + uusiPalkka);

       System.out.println("Palkkaasi korotetaan 20%");
       uusiPalkka = palkankorotus.palkanKorotus(uusiPalkka, 0.2);
       System.out.println("Palkkasi on " + uusiPalkka);
    }
}
