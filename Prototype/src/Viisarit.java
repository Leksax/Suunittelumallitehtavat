public class Viisarit implements Cloneable{
    private int currentTime;

    public Viisarit(){
        this.currentTime = 0;
    }
    public void setCurrentTime(int currentTime){
        this.currentTime = currentTime;
    }
    public String toString(){
        return String.valueOf(this.currentTime);
    }
    public Object clone(){
        try{
            return super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }
}
