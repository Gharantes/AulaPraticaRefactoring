import java.util.Enumeration;

public abstract class Statement {
    protected abstract String getHeader(Customer aCustomer);
    protected abstract String getRentalDetails(Rental aRental);
    protected abstract String getAmountOwed(Customer aCustomer);
    protected abstract String getFrequentRenterPoints(Customer aCustomer);
}
