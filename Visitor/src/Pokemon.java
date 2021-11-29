public class Pokemon {

    private int exp;
    private Abilities state;
    private String stage;

    public Pokemon(int exp, Abilities state){
        this.exp = exp;
        this.state = state;
    }

    public String getStage() {
        stage = state.getStage();
        return stage;
    }

    public int getExp(){
        return exp;
    }

    public void setExp(int exp){
        this.exp = exp;
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
    public void visit(Visitor visit){
        visit.visit(this);
        evolve();
    }
}
