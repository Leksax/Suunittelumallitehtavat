public class Player extends Thread{

       private Guesser guesser;
       private Object memento;
       private String name;
       private boolean guessing;
       private int guessAmount;


       public Player(String name, Guesser guesser){
           this.name = name;
           this.guesser = guesser;
           guessing = true;
           guessAmount = 0;
       }

       @Override
       public void run(){
            guesser.joinGame(this);
            while(guessing == true){
                int guess = (int) (Math.random() * 10);
                guessRandomNumber(guess);
            }
       }
       public void guessRandomNumber(int number){
           guessAmount++;
           guesser.check(this, number);
       }
       public void guessedRight(){
        guessing = false;
       }
       public void numberToGuesser(Object memento){
           this.memento = memento;
       }
       public Object mementoToGuesser(){
        return memento;
       }
       public String getPlayerName(){
           return name;
       }
       public int getGuessAmount(){
           return guessAmount;
       }
}
