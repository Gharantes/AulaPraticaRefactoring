public class TextStatement extends Statement {
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
