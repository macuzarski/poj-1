package pl.pjait.refactored.discounts;

import pl.pjait.refactored.model.Cart;

public interface ICanApplyDiscount {
    boolean canApplyDiscount(Cart cart);
    void applyDiscount(Cart cart);
}
