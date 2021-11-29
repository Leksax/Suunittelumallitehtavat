import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Abilities squirtle = new Squirtle();
        Abilities staryu = new Staryu();
        Abilities blastoise = new Blastoise();

        Pokemon pokemon = new Pokemon(0, squirtle);
        Pokemon pokemon1 = new Pokemon(95, staryu);
        Pokemon pokemon2 = new Pokemon (99, blastoise);

        Visitor visit = new BonusVisitor();

        pokemon.attackOne();
        pokemon.visit(visit);
        TimeUnit.SECONDS.sleep(2);

        pokemon1.attackThree();
        pokemon1.visit(visit);
        TimeUnit.SECONDS.sleep(2);

        pokemon2.attackTwo();
        pokemon2.visit(visit);
        TimeUnit.SECONDS.sleep(2);

    }
}