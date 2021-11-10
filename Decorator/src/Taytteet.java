public abstract class Taytteet implements Pizza {

    private Pizza pizza;
    private double hinta = 0;

    public Taytteet(Pizza pizza) {
        super();
        this.pizza = pizza;

    }

    @Override
    public String tayta() {
        return pizza.tayta();
    }

    @Override
    public double hinta() {
        return pizza.hinta();

    }
}

