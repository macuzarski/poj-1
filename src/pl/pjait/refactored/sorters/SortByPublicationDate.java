package pl.pjait.refactored.sorters;

import pl.pjait.refactored.model.ProductOffer;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByPublicationDate implements ISortBy{
    @Override
    public void sort(ArrayList<ProductOffer> productOffers, boolean ascending) {
        if (ascending) {
            productOffers.sort(Comparator.comparing(ProductOffer::getPublicationDate));
        } else {
            productOffers.sort(Comparator.comparing(ProductOffer::getPublicationDate).reversed());
        }
    }
}
