package pl.pjait.refactored.discounts;

import pl.pjait.refactored.model.Cart;
import pl.pjait.refactored.model.CartItem;
import pl.pjait.refactored.model.Product;

public class FreeCupDiscount implements ICanApplyDiscount{

    public boolean canApplyDiscount(Cart cart) {
        return cart.totalPriceOfProducts()>200;
    }

    public void applyDiscount(Cart cart) {
        Product cup = new Product();
        cup.setName("Extra cup");
        cup.setPrice(0);

        cart.getItems().add(new CartItem(cup));
    }

}
