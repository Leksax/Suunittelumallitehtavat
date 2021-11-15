public class Blastoise implements Abilities {
    public void attackOne(Pokemon pokemon){
        System.out.println("Blastoise uses Hydro Pump");
    }

    public void attackTwo(Pokemon pokemon){
        System.out.println("Blastoise uses Skull Bash");
    }

    public void attackThree(Pokemon pokemon){
        System.out.println("Blastoise uses Iron Defense");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Blastoise gained a level");
    }
}