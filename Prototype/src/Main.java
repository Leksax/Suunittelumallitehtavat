public class Main {

    public static void main(String[] args){
        Kello clock = new Kello();
        Kello clone = clock.clone();

        System.out.println("Kellon aika : " + clock.getTime());
        System.out.println("Syväkopion aika : " +  clone.getTime());

        clock.setTime(6, 30);
        System.out.println("Kellon aika : " + clock.getTime());
        System.out.println("Syväkopion aika : " +  clone.getTime());

        clone.setTime(12,45);
        System.out.println("Kellon aika : " + clock.getTime());
        System.out.println("Syväkopion aika : " +  clone.getTime());
    }
}
