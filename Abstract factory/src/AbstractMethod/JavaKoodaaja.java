package AbstractMethod;

public abstract class JavaKoodaaja {
    Boss tpaita = null;
    Boss farmarit = null;
    Boss Lippis = null;
    Boss Kengat = null;

    public JavaKoodaaja(){

    }
    public abstract Boss createTpaita();
    public abstract Boss createLippis();
    public abstract Boss createFarmarit();
    public abstract Boss createKengat();


    public void kerroVaatteet(){
        this.kerro();
    }
    
    public void kerro(){
        if (this.tpaita == null){
            this.tpaita = this.createTpaita();
        }
        if (this.farmarit == null){
            this.farmarit = this.createFarmarit();
        }
        if (this.Lippis == null){
            this.Lippis = this.createLippis();
        }
        if (this.Kengat == null){
            this.Kengat = this.createKengat();
        }
        System.out.println("Käytän " + this.tpaita + this.farmarit + this.Lippis + this.Kengat);
    }
}
