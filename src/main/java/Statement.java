import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Statement {

    double  totalAmount  =  0;
    int  frequentRenterPoints  =  0;
    Enumeration rentals;

    public String generateStatement(ArrayList<Rental> _rentals, String name){
        rentals  = Collections.enumeration(_rentals);
        String  result  =  "Rental  Record  for  "  +  name +  "\n";

        for(Rental rental : _rentals){
            double  thisAmount  =  0;
            //determine  amounts  for  each  line
            thisAmount = rental.getAmount();
            //  add  frequent  renter  points
            frequentRenterPoints  ++;
            //  add  bonus  for  a  two  day  new  release  rental
            if  ((rental.getMovie().getPriceCode()  ==  MoviePriceCodes.NEW_RELEASE)&& rental.getDaysRented()  >  1){
                frequentRenterPoints  ++;
            }
            //show  figures  for  this  rental
            result  +=  "\t"  + rental.getMovie().getTitle()+  "\t"  +
                    thisAmount  +  "\n";
            totalAmount  +=  thisAmount;
        }

        //add  footer  lines
        result  +=  "Amount  owed  is  "  +  totalAmount  +  "\n";
        result  +=  "You  earned  "  +  frequentRenterPoints  +
                "  frequent  renter  points";
        return  result;

    }
}
