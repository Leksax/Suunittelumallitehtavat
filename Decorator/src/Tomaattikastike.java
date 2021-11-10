public class Tomaattikastike extends Taytteet{

    private double hinta = 0.25;
    public Tomaattikastike(Pizza pizza){
        super(pizza);
    }

    public String tayta(){
        return super.tayta() + taytaTomaattikastikkeella();
    }

    public String taytaTomaattikastikkeella(){
        return " tomaattikastike";
    }

    @Override
    public double hinta(){
       return super.hinta() + tomaattikastikkeenHinta();
    }

    public double tomaattikastikkeenHinta(){
        return hinta;
    }
}
