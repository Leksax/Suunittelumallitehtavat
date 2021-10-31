package FactoryMethod;

public class Martta extends AterioivaOtus{

    public Juoma createJuoma() { return new Marjamehu();}
}
