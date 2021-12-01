public class Main {
    public static void main(String[] args) {
        BurgerSeller seller = new McD();
        seller.makeCheeseBurger().getBurger();

        BurgerSeller seller2 = new Hese();
        seller2.makeCheeseBurger().getBurger();
    }
}
