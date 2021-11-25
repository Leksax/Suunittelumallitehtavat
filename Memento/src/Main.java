public class Main {
 public static void main(String[] args) throws InterruptedException {
     Guesser guesser = new Guesser();
     Player[] guessers = new Player[5];
     guessers[0] = new Player("First Player", guesser);
     guessers[1] = new Player("Second Player", guesser);
     guessers[2] = new Player("Third Player", guesser);
     guessers[3] = new Player("Fourth Player", guesser);
     guessers[4] = new Player("Fifth Player", guesser);

     for (int i = 0; i < guessers.length; i++){
         guessers[i].start();
         guessers[i].join();
         System.out.println(guessers[i].getPlayerName() + " guessed right number after " + guessers[i].getGuessAmount() + " guesses");
     }
 }
}
