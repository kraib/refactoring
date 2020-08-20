public class NewRelease extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double getCharge(int daysRented) {
        return daysRented  *  3;
    }
    public int getRenterPoints(int daysRented){
        if  (daysRented  >  1)  {
            return 2;
        }
        return 1;
    }
}
