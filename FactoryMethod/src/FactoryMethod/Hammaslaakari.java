package FactoryMethod;

public class Hammaslaakari extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };
}
