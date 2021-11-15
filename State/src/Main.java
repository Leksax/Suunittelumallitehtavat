import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pokemon pokemon = new Pokemon();
        for (int i = 0; i < 10; i++){
            pokemon.attackOne();
            TimeUnit.SECONDS.sleep(1);
            pokemon.attackTwo();
            TimeUnit.SECONDS.sleep(1);
            pokemon.attackThree();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
