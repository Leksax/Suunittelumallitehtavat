import java.util.ArrayList;
import java.util.List;

public class BurgerList implements Tietorakenne{
    private List<IBurgerBuilder> ingredients = new ArrayList<>();

    public void addIngredient(IBurgerBuilder ingredient){
        ingredients.add(ingredient);
    }
    public void getBurger(){
        for (IBurgerBuilder burger : ingredients){
            System.out.println("MCdonalds " + burger.name());
            System.out.println("Contains : " + burger.addBun().add() +  burger.addCheese().add() +  burger.addPatty().add() + burger.addBun().add());
        }
    }
}
