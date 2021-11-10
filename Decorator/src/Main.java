public class Main {
    public static void main(String args[]) {

        Pizza hawaiiA = new Kinkku(new Aurajuusto(new Ananas(new Juusto(new Tomaattikastike(new Pizzapohja())))));
        Pizza hawaii = new Kinkku(new Ananas(new Juusto(new Tomaattikastike(new Pizzapohja()))));
        Pizza kinkkukebu = new Kebab(new Kinkku(new Juusto(new Tomaattikastike(new Pizzapohja()))));

        System.out.println("Menu");
        System.out.print(hawaiiA.tayta());
        System.out.println(" : " + hawaiiA.hinta() + " euroa.");
        System.out.print(hawaii.tayta());
        System.out.println(" : " + hawaii.hinta() + " euroa.");
        System.out.print(kinkkukebu.tayta());
        System.out.println(" : " + kinkkukebu.hinta() + " euroa.");

    }
}

