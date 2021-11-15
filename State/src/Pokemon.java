public class Pokemon {

    private int exp = 0;
    private Abilities state = new Squirtle();

    public int getExp(){
        return exp;
    }
    public void setExp(){
        this.exp = exp;
    }
    public Abilities getState(){
        return state;
    }
    public void setState(Abilities state){
        this.state = state;
    }

    public void attackOne(){
        state.attackOne(this);
        exp = exp + 20;
        evolve();
    }

    public void attackTwo(){
        state.attackTwo(this);
        exp = exp + 10;
        evolve();
    }

    public void attackThree(){
        state.attackThree(this);
        exp = exp + 5;
        evolve();
    }

    public void evolve(){
        if (exp > 100){
            state.evolve(this);
            exp = 0;
        }
    }
}
