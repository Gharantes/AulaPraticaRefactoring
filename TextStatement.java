import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        String result = getHeader(aCustomer);

        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getRentalDetails(each);
        }

        result += getAmountOwed(aCustomer);
        result += getFrequentRenterPoints(aCustomer);
        return result;
    }

    protected String getHeader(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }
    protected String getRentalDetails(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle() + "\t" +
                aRental.getCharge() + "\n";
    }
    protected String getAmountOwed(Customer aCustomer) {
        return "Amount owed is " +
                aCustomer.getTotalCharge() + "\n";
    }
    protected String getFrequentRenterPoints(Customer aCustomer) {
        return "You earned " +
                aCustomer.getTotalFrequentRenterPoints() +
                " frequent renter points";
    }
}
