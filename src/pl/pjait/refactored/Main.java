package pl.pjait.refactored;

import pl.pjait.refactored.discounts.SetOfDiscounts;
import pl.pjait.refactored.discounts.FreeCupDiscount;
import pl.pjait.refactored.discounts.PercentDiscount;
import pl.pjait.refactored.discounts.ThirdForFreeDiscount;
import pl.pjait.refactored.filters.FilterBy;
import pl.pjait.refactored.model.*;
import pl.pjait.refactored.sorters.SortByOfferName;
import pl.pjait.refactored.sorters.SortByProductionYear;
import pl.pjait.refactored.sorters.SortByPublicationDate;
import pl.pjait.refactored.util.CurrentDate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cart cart = getSampleCart();

//        cart.applyDiscount(new FreeCupDiscount());
//        cart.applyDiscount(new PercentDiscount(0.05));
//        cart.applyDiscount(new ThirdForFreeDiscount());
        SetOfDiscounts discountSet = new SetOfDiscounts();
        discountSet.getDiscounts().add(new FreeCupDiscount());
        discountSet.getDiscounts().add(new PercentDiscount(0.05));
        discountSet.getDiscounts().add(new ThirdForFreeDiscount());
        cart.applyDiscount(discountSet);

        printCart(cart);
        Car c1 = new Car("Nissan", 34000.00, 2016, 170000);
        Car c2 = new Car("Honda", 44000.00, 2018, 222000);
        Car c3 = new Car("Toyota", 55000.00, 2011, 144000);
        ProductOffer p1 = new ProductOffer(c1, "tani autko", CurrentDate.asString());
        ProductOffer p2 = new ProductOffer(c2, "niemiec plakal", "2022-04-03");
        ProductOffer p3 = new ProductOffer(c3, "nie opel ale sprzedam", "2023-05-03");
        SortByOfferName priceSorter = new SortByOfferName();
        Car c4 = new Car("opel", 10000.00, 1999, 69000);
        ArrayList<ProductOffer> motoOto = new ArrayList<>();
        motoOto.add(p3);
        motoOto.add(p2);
        motoOto.add(p1);

        printOffers(motoOto);
        priceSorter.sort(motoOto, true);
        printOffers(motoOto);
        priceSorter.sort(motoOto, false);
        printOffers(motoOto);
        ArrayList<ProductOffer> filtered = FilterBy.filterBy(motoOto, "2022-05-02", "2024-05-05");
        printOffers(filtered);
        filtered = FilterBy.filterBy(motoOto, "nie");
        printOffers(filtered);
        filtered = FilterBy.filterBy(motoOto, 30000.00, 50000.00);
        printOffers(filtered);
        filtered = FilterBy.filterByProduction(motoOto, 2017, 2025);
        printOffers(filtered);




    }

    public static void printOffers(ArrayList<ProductOffer> motoOto) {
        System.out.println("=================================");
        for (ProductOffer productOffer : motoOto) {
            System.out.println(productOffer);
            if (productOffer.getProduct() instanceof Car) {
                System.out.println("rocznik: "+ ((Car) productOffer.getProduct()).getProductionYear());
            }
        }
        System.out.println("=================================");

    }

    public static ArrayList<Product> getSampleProducts() {
        ArrayList<Product> sample = new ArrayList<Product>();
        for (int i = 1; i <= 6; i++) {
            Product p = new Product();
            p.setName("Product " + i);
            p.setPrice(i * 25);
            sample.add(p);
        }
        return sample;
    }

    public static Cart getSampleCart() {
        Cart cart = new Cart();
        for (Product p : getSampleProducts()) {
            cart.getItems().add(new CartItem(p));
        }
        return cart;
    }

    public static void printCart(Cart cart) {
        System.out.println("=========================================");
        System.out.println("|Nazwa produktu\t|Cena\t|Cena promocyjna|");
        System.out.println("-----------------------------------------");
        for (CartItem item : cart.getItems()) {
            System.out.println("|"
                    + item.getProduct().getName() + "\t\t|"
                    + item.getProduct().getPrice() + "\t|"
                    + item.getCurrentPrice() + "\t\t\t|");
            System.out.println("-----------------------------------------");
        }
        System.out.println("Suma: "+cart.totalPriceOfProducts());
        System.out.println("Suma po promocji "+cart.totalPriceOfDiscountedProducts());

    }





}
