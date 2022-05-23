package pl.pjait.refactored.sorters;

import pl.pjait.refactored.model.ProductOffer;

import java.util.ArrayList;

public interface ISortBy {
    void sort(ArrayList<ProductOffer> productOffers, boolean ascending);
}
