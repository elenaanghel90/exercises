package vehicles;

public class Car implements IVehicle{

    private String manufacturer;
    private int horsePower;
    private int wheels;
    private boolean isConvertible;

    public boolean isConvertible() {
        return isConvertible;
    }

    public Car(String manufacturer, int horsePower, int wheels,boolean isConvertible) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.wheels = wheels;
        this.isConvertible = isConvertible;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public Car(String manufacturer, int horsePower, int wheels) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.wheels = wheels;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public int getNumberOfWheels() {
        return wheels;
    }
}
