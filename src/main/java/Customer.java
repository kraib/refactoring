import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }
    public  String  statement()  {
        Enumeration  rentals  =  _rentals.elements();
        String  result  =  "Rental  Record  for  "  +  getName()  +  "\n";
        while  (rentals.hasMoreElements())  {
            Rental  each  =  (Rental)  rentals.nextElement();
            result  +=  "\t"  +  each.getMovie().getTitle()+  "\t"  +
                    String.valueOf(each.getCharge())  +  "\n";

        }
        result  +=  "Amount  owed  is  "  +  String.valueOf(getTotalCharge())  +  "\n";
        result  +=  "You  earned  "  +  String.valueOf(getTotalFrequencyRenterPoints())  +
                "  frequent  renter  points";
        return  result;
    }
    public  String  HTMLstatement()  {
        Enumeration  rentals  =  _rentals.elements();
        String  result  =  "<H1>"+"Rental  Record  for  "  +  getName()  +  "</H1>";
        while  (rentals.hasMoreElements())  {
            Rental  each  =  (Rental)  rentals.nextElement();
            result  +=  "<p>"  +  each.getMovie().getTitle()+  "</p>"  +
                    String.valueOf(each.getCharge())  +  "<br/>";

        }
        result  +=  "Amount  owed  is  "  +  String.valueOf(getTotalCharge())  +  "<br/>";
        result  +=  "You  earned  "  +  String.valueOf(getTotalFrequencyRenterPoints())  +
                "  frequent  renter  points";
        return  result;
    }

    public int getTotalFrequencyRenterPoints(){
        int  result  =  0;
        Enumeration  rentals  =  _rentals.elements();
        while  (rentals.hasMoreElements())  {
            Rental  each  =  (Rental)  rentals.nextElement();
            result += each.getRenterPoints();
        }
        return result;
    }
    public double getTotalCharge(){
        Enumeration  rentals  =  _rentals.elements();
        double  result  =  0;
        while  (rentals.hasMoreElements())  {
            Rental  each  =  (Rental)  rentals.nextElement();
            result +=  each.getCharge();
        }
        return result;
    }
}