public class BurgerStringBuilder implements Tietorakenne{
    private StringBuilder burger;

    public BurgerStringBuilder(){
        burger = new StringBuilder();
    }
    public void addIngredient(String ingredient){
        burger.append(ingredient);
    }
    public void getBurger(){
        System.out.println("Hese Cheese Burger");
        System.out.println("Contains " + burger);
    }
}
