//Nandagopan Dilip
//301166925

public class Car {
    private String manufacturer;
    private int make;
    private String model;
    private static int VI_NUMBER = 1001;
    private int VIN = VI_NUMBER;
    private double basePrice;
    private CarType type;

    //constructor
    public Car(String manufacturer, int make, String model, double basePrice, CarType type) {
        this.manufacturer = manufacturer;
        this.make = make;
        this.model = model;
        this.basePrice = basePrice;
        this.type = type;
        VIN += 10;
        VI_NUMBER += 100;
    }

    //getters
    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public static int getViNumber() {
        return VI_NUMBER;
    }

    public int getVIN() {
        return this.VIN;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public CarType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return  "manufacturer: " + this.manufacturer +
                "\nmake: " + this.make +
                "\nmodel: " + this.model +
                "\nVIN: " + this.VIN +
                "\nBase Price: " + this.basePrice +
                "\nType: " + this.type;
    }
}
