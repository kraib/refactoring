public class Children extends Price{
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    double getCharge(int daysRented) {
        double thisAmount  =  1.5;
        if  (daysRented  >  3)
            thisAmount  +=  (daysRented  -  3)  *  1.5;
        return thisAmount;
    }
}
