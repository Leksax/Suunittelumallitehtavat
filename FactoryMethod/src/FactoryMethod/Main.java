package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus hammaslaakari = new Hammaslaakari();
        AterioivaOtus martta = new Martta();
        opettaja.aterioi();
        hammaslaakari.aterioi();
        martta.aterioi();
    }
}
