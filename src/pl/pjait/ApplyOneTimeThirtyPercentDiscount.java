package pl.pjait;

public class ApplyOneTimeThirtyPercentDiscount implements ICanCalculateSpecialOffer {
    @Override
    public boolean canCalculate(Cart cart) {
        return cart.isPromoCodeApplied();
    }

    //if client doesn't choose any product for discount, the cheapest one gets discounted by default
    @Override
    public void calculateOffer(Cart cart) {
        CartService cartService = new CartService();
        Product cheapestOne = cartService.getCheapestOne(cart.getProducts());
        cheapestOne.setDiscountPrice(0.7*cheapestOne.getPrice());
        cart.setPromoCodeApplied(true);
    }

    public void calculateOffer(Cart cart, Product product) {
        for (Product cartProduct : cart.getProducts()) {
            if (product == cartProduct) {
                cartProduct.setDiscountPrice((0.7*cartProduct.getPrice()));
            }
        }
        cart.setPromoCodeApplied(true);
    }
}
