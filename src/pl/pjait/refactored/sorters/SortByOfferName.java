package pl.pjait.refactored.sorters;

import pl.pjait.refactored.model.ProductOffer;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByOfferName implements ISortBy{
    @Override
    public void sort(ArrayList<ProductOffer> productOffers, boolean ascending) {
        if (ascending) {
            productOffers.sort(Comparator.comparing(ProductOffer::getOfferName));
        } else {
            productOffers.sort(Comparator.comparing(ProductOffer::getOfferName).reversed());
        }
    }
}
