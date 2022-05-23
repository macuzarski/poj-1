package pl.pjait.refactored.model;

import pl.pjait.refactored.util.CurrentDate;

public class ProductOffer {
    private Product product;
    private String offerName;
    private final String publicationDate;

    public ProductOffer(Product product, String offerName) {
        this.product = product;
        this.offerName = offerName;
        this.publicationDate = CurrentDate.asString();
    }

    public ProductOffer(Product product, String offerName, String publicationDate) {
        this.product = product;
        this.offerName = offerName;
        this.publicationDate = publicationDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return
                "oferta: " + this.getOfferName()
                        + ",\t" + "cena :"
                        + this.getProduct().getPrice() + ",\t" +
                        this.getPublicationDate();
    }
}
