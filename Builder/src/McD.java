public class McD implements BurgerSeller{
    @Override
    public Tietorakenne makeCheeseBurger() {
        BurgerList burger = new BurgerList();
        burger.addIngredient(new CheeseBurger());
        return burger;
    }
}
