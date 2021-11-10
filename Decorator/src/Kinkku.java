public class Kinkku extends Taytteet {

    private double hinta = 1.25;

    public Kinkku(Pizza pizza) {
        super(pizza);
    }

    public String tayta() {
        return super.tayta() + taytaKinkulla();
    }

    public String taytaKinkulla() {
        return " kinkku";
    }

    @Override
    public double hinta() {
        return super.hinta() + kinkunHinta();
    }

    public double kinkunHinta() {
        return hinta;
    }
}

