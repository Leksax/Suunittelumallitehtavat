public class Hese implements BurgerSeller {
    @Override
    public Tietorakenne makeCheeseBurger() {
        BurgerStringBuilder burger = new BurgerStringBuilder();
        burger.addIngredient("Bottom bun ");
        burger.addIngredient("Beef Patty ");
        burger.addIngredient("American cheese ");
        burger.addIngredient("Top Bun");
        return burger;
    }
}
