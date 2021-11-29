public class BonusVisitor implements Visitor{
    public void visit(Pokemon pokemon){
        int exp = pokemon.getExp();
        String stage = pokemon.getStage();

        switch(stage){
            case "1":
                exp = exp + 10;
                pokemon.setExp(exp);
                System.out.println("Gained 10 bonus experience after beating an enemy in a battle");
                break;
            case "2":
                exp = exp + 5;
                pokemon.setExp(exp);
                System.out.println("Gained 5 bonus experience after beating an enemy in a battle");
                break;
            case "3":
                exp = exp + 1;
                pokemon.setExp(exp);
                System.out.println("Gained 1 bonus experience after beating an enemy in a battle");
                break;
        }
    }
}
