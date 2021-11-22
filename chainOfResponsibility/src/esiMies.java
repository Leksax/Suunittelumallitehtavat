public class esiMies implements palkanKorotus{
    private palkanKorotus uusiPalkankorottaja;

    public esiMies(){
        uusiPalkankorottaja = new Paallikko();
    }

    @Override
    public double palkanKorotus(double palkka, double korotus){
        if (korotus <= 0.02){
            System.out.println("palkankorottajana Esimies");
            return palkka*(1+korotus);
        } else {
            return uusiPalkankorottaja.palkanKorotus(palkka,korotus);
        }
    }
}

