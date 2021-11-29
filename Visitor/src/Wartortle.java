public class Wartortle implements Abilities {
    private String stage = "2";
    public String getStage(){
        return stage;
    }
    public void attackOne(Pokemon pokemon){
        System.out.println("Wartortle uses Water Pulse");
    }

    public void attackTwo(Pokemon pokemon){
        System.out.println("Wartortle uses Bite");
    }

    public void attackThree(Pokemon pokemon){
        System.out.println("Wartortle uses Rain Dance");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("What? Wartortle is evolving!?");
        pokemon.setState(new Blastoise());
        System.out.println("Wartortle evolved into Blastoise");
    }
}