package pl.pjait.refactored.model;

public class Car extends Product{
    private int productionYear, mileage;

    public Car(int productionYear, int mileage) {
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(String name, double price, int productionYear, int mileage) {
        super(name, price);
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


}
