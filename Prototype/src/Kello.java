public class Kello implements Cloneable{

    private Viisarit hour;
    private Viisarit minute;

    public Kello(){
        this.hour = new Viisarit();
        this.minute = new Viisarit();
    }

    public String getTime(){
        return hour + ":" + minute;
    }

    public void setTime(int h, int m){
        this.hour.setCurrentTime(h);
        this.minute.setCurrentTime(m);
    }

    public Kello clone(){
        Kello clock;
        try{
            clock = (Kello)super.clone();
            clock.hour = (Viisarit) this.hour.clone();
            clock.minute = (Viisarit) this.minute.clone();
            return clock;
        } catch (CloneNotSupportedException e){
            return null;
        }
    }
}
