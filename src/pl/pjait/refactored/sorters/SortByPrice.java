package pl.pjait.refactored.sorters;

import pl.pjait.refactored.model.ProductOffer;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByPrice implements ISortBy {
    @Override
    public void sort(ArrayList<ProductOffer> productOffers, boolean ascending) {
        if (ascending) {
            productOffers.sort(Comparator.comparingDouble(o -> o.getProduct().getPrice()));
        } else {
            productOffers.sort(Comparator.comparingDouble((ProductOffer o) -> o.getProduct().getPrice()).reversed());
        }
    }
}
