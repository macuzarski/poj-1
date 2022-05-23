package pl.pjait.refactored.model;

import pl.pjait.refactored.discounts.ICanApplyDiscount;

import java.util.ArrayList;

public class Cart {

    ArrayList<CartItem> items = new ArrayList<CartItem>();

    public double totalPriceOfProducts() {

        double sum = 0;
        for (CartItem item : items) {
            sum += item.getProduct().getPrice();
        }
        return sum;
    }

    public double totalPriceOfDiscountedProducts() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getCurrentPrice();
        }
        return sum;
    }

    public void applyDiscount(ICanApplyDiscount discount) {
        if (discount.canApplyDiscount(this)) {
            discount.applyDiscount(this);
        }
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }
}
