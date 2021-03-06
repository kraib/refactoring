import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomerTest {
    @Test
    public void can_print_statement_(){
        Customer customer = new Customer(
                "Ing. Meike Fritsch"
        );
        Rental rental = create_rental();
        customer.addRental(rental);
        String statement = customer.statement();
        String result ="Rental  Record  for  Ing. Meike Fritsch\n" +
                "\tSound of Music\t15.0\n" +
                "Amount  owed  is  15.0\n" +
                "You  earned  1  frequent  renter  points";
        assertEquals(statement, result);
    }

    public Rental create_rental(){
        Movie movie = new Movie("Sound of Music", Movie.CHILDREN);
        Rental rental = new Rental(movie, 12);
        return rental;
    }
}
