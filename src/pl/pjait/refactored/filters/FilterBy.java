package pl.pjait.refactored.filters;

import pl.pjait.refactored.model.Car;
import pl.pjait.refactored.model.ProductOffer;

import java.util.ArrayList;

public class FilterBy {

    public static ArrayList<ProductOffer> filterBy(ArrayList<ProductOffer> offers, String title) {
        ArrayList<ProductOffer> result = new ArrayList<>();
        for (ProductOffer offer : offers) {
            if (offer.getOfferName().contains(title)) {
                result.add(offer);
            }
        }

        return result;
    }

    public static ArrayList<ProductOffer> filterBy(ArrayList<ProductOffer> offers, String dateL, String dateM) {
        ArrayList<ProductOffer> result = new ArrayList<>();
        for (ProductOffer offer : offers) {
            if (offer.getPublicationDate().compareTo(dateL) >= 0
                    && offer.getPublicationDate().compareTo(dateM) <= 0) {
                result.add(offer);
            }
        }
        return result;
    }

    public static ArrayList<ProductOffer> filterBy(ArrayList<ProductOffer> offers,
                                                   double priceRangeL,
                                                   double priceRangeM) {
        ArrayList<ProductOffer> result = new ArrayList<>();
        for (ProductOffer offer : offers) {
            if (offer.getProduct().getPrice() >= priceRangeL && offer.getProduct().getPrice() <= priceRangeM) {
                result.add(offer);
            }
        }

        return result;
    }

    public static ArrayList<ProductOffer> filterByProduction(ArrayList<ProductOffer> offers, int min, int max) {
        ArrayList<ProductOffer> result = new ArrayList<>();
        for (ProductOffer offer : offers) {
            Car c = (Car) offer.getProduct();
            if (rangesBetween(c.getProductionYear(), min, max)) {
                result.add(offer);
            }
        }

        return result;
    }

    public static ArrayList<ProductOffer> filterByMileage(ArrayList<ProductOffer> offers, int min, int max) {
        ArrayList<ProductOffer> result = new ArrayList<>();
        for (ProductOffer offer : offers) {
            Car c = (Car) offer.getProduct();
            if (rangesBetween(c.getMileage(), min, max)) {
                result.add(offer);
            }
        }

        return result;
    }

    private static boolean rangesBetween(int v, int min, int max) {
        return v >= min && v <= max;
    }

}
