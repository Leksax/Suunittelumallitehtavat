public class Kebab extends Taytteet{

    public double hinta = 1.35;

    public Kebab (Pizza pizza){
        super(pizza);
    }
    public String tayta(){
        return super.tayta() + taytaKebabilla();
    }
    public String taytaKebabilla(){
        return " kebab";
    }

    @Override
    public double hinta(){
        return super.hinta() + kebabinHinta();
    }
    public double kebabinHinta(){
        return hinta;
    }
}
