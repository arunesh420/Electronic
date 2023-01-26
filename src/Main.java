import Models.DryGrinder;

public class Main {
    public static void main(String[] args) {

        DryGrinder dg = new DryGrinder(true, 30, "2023");
        dg.getDevice();
        dg.getProduct();
        dg.getProductType();
        dg.getManufacturedDate();
        dg.getBladeSpeed();
        dg.getCompany();
        dg.isWarranty();
    }
}