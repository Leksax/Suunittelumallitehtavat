public class CurrencyAdapter implements ICurrencyAdapter{
    private Currency euro;

    public CurrencyAdapter(Currency euro){
        this.euro = euro;
    }

    public double getCurrency(){
        return ConvertEuroToDollar(euro.getCurrency());
    }

    private double ConvertEuroToDollar(double euro){
        return euro * 1.13;
    }
}
