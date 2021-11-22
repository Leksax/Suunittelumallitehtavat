public class Paallikko implements palkanKorotus{
    private palkanKorotus uusiPalkankorottaja;

    public Paallikko(){
        uusiPalkankorottaja = new toimitusJohtaja();
    }

    @Override
    public double palkanKorotus(double palkka, double korotus) {
        if(korotus < 0.05 && korotus > 0.02){
            System.out.println("Palkankorottajana Päällikkö");
            return palkka*(1+korotus);
        } else{
            return uusiPalkankorottaja.palkanKorotus(palkka,korotus);
        }
    }
}
