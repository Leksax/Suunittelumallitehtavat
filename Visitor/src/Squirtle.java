public class Squirtle implements Abilities {
    private String stage = "1";
    public String getStage(){
        return stage;
    }
    public void attackOne(Pokemon pokemon){
        System.out.println("Squirtle uses Water Gun");
    }

    public void attackTwo(Pokemon pokemon){
        System.out.println("Squirtle uses Tackle");
    }

    public void attackThree(Pokemon pokemon){
        System.out.println("Squirtle uses Tail Whip");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("What? Squirtle is evolving!?");
        pokemon.setState(new Wartortle());
        System.out.println("Squirtle evolved into Wartortle");
    }
}
