package vehicles;

public class Moto implements IVehicle {
    private String manufacturer;
    private int horsePower;
    private int wheels;

    public int getHorsePower() {
        return horsePower;
    }

    public Moto(String manufacturer, int horsePower, int wheels) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.wheels = wheels;

    }

    public int getNumberOfWheels() {
        return wheels;
    }


    public String getManufacturer() {
        return manufacturer;
    }
}
