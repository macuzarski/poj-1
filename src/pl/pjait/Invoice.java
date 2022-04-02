package pl.pjait;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<InvoicePosition> positions = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(List<InvoicePosition> positions) {
        this.positions = positions;
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

    public List<InvoicePosition> getPositions() {
        return positions;
    }

    public void setPositions(List<InvoicePosition> positions) {
        this.positions = positions;
    }


}
