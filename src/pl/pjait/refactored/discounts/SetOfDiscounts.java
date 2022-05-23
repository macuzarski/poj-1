package pl.pjait.refactored.discounts;

import pl.pjait.refactored.model.Cart;

import java.util.ArrayList;

public class SetOfDiscounts implements ICanApplyDiscount {

    ArrayList<ICanApplyDiscount> discounts = new ArrayList<>();

    @Override
    public boolean canApplyDiscount(Cart cart) {
        for (ICanApplyDiscount discount : discounts) {
            if (discount.canApplyDiscount(cart)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void applyDiscount(Cart cart) {
        for (ICanApplyDiscount discount : discounts) {
            if (discount.canApplyDiscount(cart)) {
                cart.applyDiscount(discount);
            }
        }
    }

    public ArrayList<ICanApplyDiscount> getDiscounts() {
        return discounts;
    }
}
