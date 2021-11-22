public class toimitusJohtaja implements palkanKorotus{

    @Override
    public double palkanKorotus(double palkka, double korotus) {
        System.out.println("Palkankorottajana Toimitusjohtaja");
        return palkka*(1+korotus);
    }
}
