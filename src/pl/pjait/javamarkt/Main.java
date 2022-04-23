package pl.pjait.javamarkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product2 = new Product("223", "Mleko", 23.99, 15.99);
        Product product3 = new Product("111", "Woda", 4.99, 2.49);
        Product product4 = new Product("323", "Chleb", 6.99, 3.49);
        Cart cart = new Cart();
        List<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product3);
        products.add(product4);
        cart.setProducts(products);
//        System.out.println(cart);
        CartService service = new CartService();
//        System.out.println(service.getNExpensive(products, 2));
        Product product6 = new Product("ABC123", "Tv", 1000, 900);
        Product product7 = new Product("RTX360", "GP", 6000, 5900);
        InvoicePosition invoicePosition = new InvoicePosition(product6);
        InvoicePosition invoicePosition2 = new InvoicePosition(product7);

        Invoice invoice = new Invoice();
        invoice.addPosition(invoicePosition);
        invoice.addPosition(invoicePosition2);
        invoice.addPosition(product7);

        printoutInvoice(invoice);

        Seller bob = new Seller("Intel", "Palubickiego 518", "59959", "50 4032 0001 0000 4354");
        bob.getAccountNumber();
        invoice.setSeller(bob);
        System.out.println(invoice.getTotalValue()
        );
//        System.out.println(invoice.getInvoiceNo());


    }

    private static void printoutInvoice(Invoice invoice) {
        System.out.println("|NAZWA\t|ILOSC\t|CENA NETTO\t|CENA BRUTTO\t|STAWKA VAT\t|PODATEK");
        System.out.println("***");
        for (InvoicePosition p : invoice.getPositions()) {
            System.out.print("|" + p.getProduct().getName() + "\t\t|");
            System.out.print(p.getProductCount() + "\t\t|");
            System.out.print(p.getNettoPrice() + "\t\t|");
            System.out.print(p.getGrossPrice() + "\t\t\t|");
            System.out.print(p.getTax() + "\t\t|");
            System.out.println(p.getTaxValue());
            System.out.println("---");
        }


    }
}
