public abstract class Price {
    abstract int getPriceCode();
    abstract  double getCharge(int daysRented);
    public int getRenterPoints(int daysRented){
        return 1;
    }
}
