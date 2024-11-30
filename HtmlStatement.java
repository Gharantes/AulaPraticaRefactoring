public class HtmlStatement extends Statement {
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
