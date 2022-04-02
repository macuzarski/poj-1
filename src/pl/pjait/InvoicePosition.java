package pl.pjait;

public class InvoicePosition {
    public static final double TAX_5 = 0.05;
    public static final double TAX_8 = 0.08;
    public static final double TAX_23 = 0.23;

    private Product product;
    private int productCount;
    private double tax = TAX_23;

    public InvoicePosition() {
    }

    public InvoicePosition(Product product) {
        this.product = product;
        this.productCount = 1;
    }

    public InvoicePosition(Product product, int productCount, double tax) {
        this.product = product;
        this.productCount = productCount;
        this.tax = tax;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNettoPrice() {
        return product.getPrice() * productCount;
    }

    public double getGrossPrice() {
        return getNettoPrice() * (1 + tax);
    }

    public double getTaxValue() {
        return getGrossPrice() - getNettoPrice();
    }


}
