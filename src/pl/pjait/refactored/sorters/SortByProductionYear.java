package pl.pjait.refactored.sorters;

import pl.pjait.refactored.model.ProductOffer;
import pl.pjait.refactored.model.Car;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByProductionYear implements ISortBy{
    @Override
    public void sort(ArrayList<ProductOffer> productOffers, boolean ascending) {
        if (ascending) {
            productOffers.sort(Comparator.comparingInt(o -> ((Car) o.getProduct()).getProductionYear()));
        } else {
            productOffers.sort(Comparator
                    .comparingDouble((ProductOffer o) -> ((Car) o.getProduct()).getProductionYear()).reversed());
        }
    }
}
