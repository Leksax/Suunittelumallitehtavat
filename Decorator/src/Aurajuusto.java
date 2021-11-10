public class Aurajuusto extends Taytteet {

    private double hinta = 1.75;
    public Aurajuusto(Pizza pizza) {
        super(pizza);
    }

    public String tayta() {
        return super.tayta() + taytaTaytteella();
    }

    public String taytaTaytteella() {
        return " aurajuusto";
    }

    @Override
    public double hinta() {
        return super.hinta() + aurajuustonHinta();
    }

    public double aurajuustonHinta() {
        return hinta;
    }
}

