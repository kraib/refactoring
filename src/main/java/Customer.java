import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private ArrayList<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public  String  statement()  {
        Statement statement = new Statement();
        return statement.generateStatement(_rentals, getName());
    }
}