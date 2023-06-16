public class RewardValue {
    private double cash;
    private int miles;
    private static double exchangeRate;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash * exchangeRate);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles / exchangeRate;
    }

    public double getMilesValue(){
        return miles;
    }

    public double getCashValue() {
        return cash;
    }
}
