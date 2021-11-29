public class Blastoise implements Abilities {
    private String stage = "3";
    public String getStage(){
        return stage;
    }
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