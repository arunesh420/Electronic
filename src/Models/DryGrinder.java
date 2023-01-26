package Models;

public class DryGrinder extends Grinder {

    String ManufacturedDate;

    public String getManufacturedDate() {
        System.out.println("Manufacture Date: "+this.ManufacturedDate);
        return ManufacturedDate;
    }

    public void setManufacturedDate(String ManufacturedDate) {
        this.ManufacturedDate = ManufacturedDate;
    }

    public DryGrinder(boolean warranty, int bladeSpeed, String ManufacturedDate) {
        super(warranty, bladeSpeed);
        this.ManufacturedDate = ManufacturedDate;
    }

    public void getProductType(){
        System.out.println("Product Type: Dry");
    }
}