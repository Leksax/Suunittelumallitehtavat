public class Juusto extends Taytteet {
    private double hinta = 3;

    public Juusto(Pizza pizza) {
        super(pizza);
    }

    public String tayta() {
        return super.tayta() + taytaTaytteella();
    }

    public String taytaTaytteella() {
        return " juusto";
    }

    @Override
    public double hinta() {
        return super.hinta() + juustonHinta();
    }

    public double juustonHinta() {
        return hinta;
    }

}

