package AbstractMethod;

public class Jasper extends JavaKoodaaja {
    public Boss createTpaita() {
        return new BTpaita();
    }
    public Boss createFarmarit() {
        return new BFarmarit();
    }
    public Boss createLippis() {
        return new BLippis();
    }
    public Boss createKengat() {
        return new BKengat();
    }
}
