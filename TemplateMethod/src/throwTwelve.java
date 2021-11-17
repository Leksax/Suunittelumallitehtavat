public class throwTwelve extends Game{

    private boolean voitto = false;
    private int player;

    @Override
    void initializeGame(){
        System.out.println("Heitä luku 12 niin voitat pelin");
        System.out.println("Jos heität tuplat niin saat heittää uudelleen");
    }

    @Override
    void makePlay(int player){
        int heitto = Dice();
        int heitto2 = Dice();
        int yhteensa = heitto + heitto2;
        System.out.println(player + " heitti " + heitto + " + " + heitto2 + " = " + yhteensa);
        if(heitto == heitto2 && heitto != 6){
            System.out.println(player + " heitti tuplat, uusintaheitto");
            makePlay(player);
        }
        if(yhteensa == 12){
            voitto = true;
            this.player = player;
        }
    }

    boolean endOfGame(){
        if(voitto==true){
            return true;
        } else{
            return false;
        }
    }
    private static int Dice(){
        return (int)(Math.random()*6+1);
    }

    @Override
    void printWinner() {
        System.out.println(player + " Winner Winner Chicken Dinner");
    }
}
