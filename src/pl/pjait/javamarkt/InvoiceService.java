package pl.pjait.javamarkt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;
public class InvoiceService {


    public static double getInvoiceTotalValue(List<InvoicePosition> positions) {
        double value=0;
        for (InvoicePosition position : positions) {
            value+=position.getGrossPrice();
        }
        return value;
    }

    public static String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public static String generateInvoiceNumber() {
        DateTimeFormatter currentMomentString = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        return LocalDateTime.now().format(currentMomentString);
    }


}
