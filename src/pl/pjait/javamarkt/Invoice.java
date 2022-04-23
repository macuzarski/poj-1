package pl.pjait.javamarkt;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<InvoicePosition> positions = new ArrayList<>();
    private Client buyer;
    private Seller seller;
    private final String invoiceNo, invoicePrintDate;
    private String transactionDate;


    public Invoice() {
        this.invoiceNo = InvoiceService.generateInvoiceNumber();
        this.invoicePrintDate = InvoiceService.getCurrentDate();
    }

    public Invoice(List<InvoicePosition> positions) {
        this.positions = positions;
        this.invoiceNo = InvoiceService.generateInvoiceNumber();
        this.invoicePrintDate = InvoiceService.getCurrentDate();
    }

    public void addPosition(InvoicePosition invoicePosition) {
        this.positions.add(invoicePosition);
    }

    public void addPosition(Product product) {
        InvoicePosition invoicePosition = positionWithProduct(product);
        if (invoicePosition == null) {
            addPosition(new InvoicePosition(product));
            return;
        }
        invoicePosition.setProductCount(invoicePosition.getProductCount()+1);
    }

    private InvoicePosition positionWithProduct(Product product) {
        for (InvoicePosition position : positions) {
            if(position.getProduct().getCode().equals(product.getCode())) {
                return position;
            }
        }
        return null;
    }

    public double getTotalValue() {
        return InvoiceService.getInvoiceTotalValue(positions);
    }

    public List<InvoicePosition> getPositions() {
        return positions;
    }

    public void setPositions(List<InvoicePosition> positions) {
        this.positions = positions;
    }

    public Client getBuyer() {
        return buyer;
    }

    public void setBuyer(Client buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getInvoicePrintDate() {
        return invoicePrintDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
