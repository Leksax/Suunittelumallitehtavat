public abstract class BurgerBuilder implements IBurgerBuilder{
    @Override
    public Cheese addCheese() {
        return new AmericanCheese();
    }


    @Override
    public Patty addPatty() {
        return new BeefPatty();
    }

    public Bun addBun() {
        return new normalBun();
    }
}
