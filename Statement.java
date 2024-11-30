import java.util.Enumeration;

public abstract class Statement {
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

    protected abstract String getHeader(Customer aCustomer);
    protected abstract String getRentalDetails(Rental aRental);
    protected abstract String getAmountOwed(Customer aCustomer);
    protected abstract String getFrequentRenterPoints(Customer aCustomer);
}
