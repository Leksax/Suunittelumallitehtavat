public class Guesser {

  public void joinGame(Player guesser){
      guesser.numberToGuesser(new Memento((int) (Math.random() * 10)));
  }
  private class Memento {
        private int correctGuess;
        public Memento(int number) {
            correctGuess = number;
        }
  }
  public void check(Player guesser, int guess){
      Memento memento = (Memento) guesser.mementoToGuesser();

      if(memento.correctGuess != guess){
          System.out.println(guesser.getPlayerName() + " guessed " +  guess + " which is wrong, try again");
      } else{
          System.out.println(guesser.getPlayerName() + " guessed " + guess + " which is correct");
          guesser.guessedRight();
      }
  }
}

