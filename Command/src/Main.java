public class Main {
    public static void main(String[] args){
        Valkokangas valkokangas = new Valkokangas();
        Command ylos = new FlipUpCommand(valkokangas);
        Command alas = new FlipDownCommand(valkokangas);
        WallButton button1 = new WallButton(ylos);
        WallButton button2 = new WallButton(alas);

        button1.push();
        button2.push();
    }
}
