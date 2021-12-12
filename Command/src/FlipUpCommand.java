public class FlipUpCommand implements Command{
    private Valkokangas valkokangas;

    public FlipUpCommand(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute(){
        valkokangas.ylos();
    }
}
