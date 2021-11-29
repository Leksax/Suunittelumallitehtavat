public class Staryu implements Abilities {
    private String stage = "1";
    public String getStage(){
        return stage;
    }
    public void attackOne(Pokemon pokemon){
        System.out.println("Staryu uses Water Gun");
    }

    public void attackTwo(Pokemon pokemon){
        System.out.println("Staryu uses Tackle");
    }

    public void attackThree(Pokemon pokemon){
        System.out.println("Staryu uses Rapid Spin");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("What? Staryu is evolving!?");
        pokemon.setState(new Starmie());
        System.out.println("Staryu evolved into Starmie");
    }
}
