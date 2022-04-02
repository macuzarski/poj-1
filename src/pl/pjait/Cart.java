package pl.pjait;

import java.util.List;

public class Cart {
    private List<Product> products;
    private boolean promoCodeApplied;

    public Cart() {
    }

    public Cart(List<Product> products, boolean promoCodeApplied) {
        this.products = products;
        this.promoCodeApplied = promoCodeApplied;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isPromoCodeApplied() {
        return promoCodeApplied;
    }

    public void setPromoCodeApplied(boolean promoCodeApplied) {
        this.promoCodeApplied = promoCodeApplied;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products.toString() +
                '}';
    }
}
