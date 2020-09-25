class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getAmount(){
        int amount = 0;
        switch  (getMovie().getPriceCode())  {
            case  MoviePriceCodes.REGULAR:
                amount  +=  2;
                if  (getDaysRented()  >  2)
                    amount  +=  (getDaysRented()  -  2)  *  1.5;
                break;
            case  MoviePriceCodes.NEW_RELEASE:
                amount  +=  getDaysRented()  *  3;
                break;
            case  MoviePriceCodes.CHILDREN:
                amount  +=  1.5;
                if  (getDaysRented()  >  3)
                    amount  +=  (getDaysRented()  -  3)  *  1.5;
                break;
        }
        return amount;
    }
}