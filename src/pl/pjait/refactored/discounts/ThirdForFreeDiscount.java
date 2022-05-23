package pl.pjait.refactored.discounts;

import pl.pjait.refactored.model.Cart;
import pl.pjait.refactored.model.CartItem;

import java.util.Collections;

public class ThirdForFreeDiscount implements ICanApplyDiscount{
    @Override
    public boolean canApplyDiscount(Cart cart) {
        return cart.getItems().size()>2;
    }

    //assumption: every third product is free
    @Override
    public void applyDiscount(Cart cart) {
        Collections.sort(cart.getItems());
        int counter = 0;
        for (CartItem item : cart.getItems()) {
            if (item.getCurrentPrice() > 0) { // don't include free extras
                counter++;
            }
            if (counter % 3 == 0) {
                item.setCurrentPrice(0);
            }
        }
    }
}
