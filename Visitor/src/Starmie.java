public class Starmie implements Abilities{
    private String stage = "2";
    public String getStage(){
        return stage;
    }
    public void attackOne(Pokemon pokemon){
        System.out.println("Starmie uses Hydro Pump");
    }

    public void attackTwo(Pokemon pokemon){
        System.out.println("Starmie uses Surf");
    }

    public void attackThree(Pokemon pokemon){
        System.out.println("Starmie uses Swift");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Starmie gained a level");
    }
}
