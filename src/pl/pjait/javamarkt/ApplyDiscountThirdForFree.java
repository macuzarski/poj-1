package pl.pjait.javamarkt;

public class ApplyDiscountThirdForFree implements ICanCalculateSpecialOffer {
    @Override
    public boolean canCalculate(Cart cart) {
        return cart.getProducts().size() == 3;
    }

    @Override
    public void calculateOffer(Cart cart) {
        CartService cartService = new CartService();
        Product cheapestOne = cartService.getCheapestOne(cart.getProducts());
        cheapestOne.setDiscountPrice(0);
    }
}
