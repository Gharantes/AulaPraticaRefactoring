import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }
    protected String getRentalDetails(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " +
                aRental.getCharge() + "<BR>\n";
    }
    protected String getAmountOwed(Customer aCustomer) {
        return "<P>You owe <EM>" +
                aCustomer.getTotalCharge() +
                "</EM><P>\n";
    }
    protected String getFrequentRenterPoints(Customer aCustomer) {
        return "On this rental you earned <EM>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
    }



}
