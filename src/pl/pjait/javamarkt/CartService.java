package pl.pjait.javamarkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartService {
    public Product getCheapestOne(List<Product> products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(999);
        for (Product product : products) {
            if (product.getPrice() <= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    public List<Product> getNSublistOfProducts(List<Product> products, int n) {
        List<Product> tempProducts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tempProducts.add(products.get(i));
        }
        return tempProducts;
    }

    public List<Product> getNCheapest(List<Product> products, int n) {
        sortProductsByPrice(products, true);
        return getNSublistOfProducts(products, n);
    }

    public List<Product> getNExpensive(List<Product> products, int n) {
        sortProductsByPrice(products, false);
        return getNSublistOfProducts(products, n);
    }


    public Product getExpensiveOne(List<Product> products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(0);
        for (Product product : products) {
            if (product.getPrice() >= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    public void sortProductsByName(List<Product> products) {
        Comparator<Product> compareByName = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        products.sort(compareByName);
    }

    public void sortProductsByPrice(List<Product> products, boolean ascending) {
        Comparator<Product> compareByPrice = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
        if (ascending) {
            products.sort(compareByPrice);
        } else {
            products.sort(compareByPrice.reversed());
        }
    }

    public double getSumOfCart(Cart cart) {
        double totalPrice = 0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
