public class Ananas extends Taytteet {

    private double hinta = 0.5;
    public Ananas(Pizza pizza) {
        super(pizza);
    }

    public String tayta() {
        return super.tayta() + taytaAnanaksella();
    }

    public String taytaAnanaksella() {
        return " ananas";
    }

    @Override
    public double hinta() {
        return super.hinta() + ananaksenHinta();
    }

    public double ananaksenHinta() {
        return hinta;
    }
}
