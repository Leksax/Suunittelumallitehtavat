public class Main {
    public static void main(String[] args){
        Currency euro = new Euro();
        System.out.println("Amount of euros " + euro.getCurrency());
        CurrencyAdapter dollar = new CurrencyAdapter(euro);
        System.out.println("Amount of euros in dollars " + String.format("%.2f",dollar.getCurrency()));
    }
}
