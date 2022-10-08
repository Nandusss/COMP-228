import java.util.ArrayList;

//Nandagopan Dilip
//301166925

public class Dealership {
    private static ArrayList<Car> carList = new ArrayList<>();
    private String id;
    private String name;
    private String address;

    //constructor
    public Dealership(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //creating car object and storing it in array list.
    public void addCar(String manufacturer, int make, String model, double basePrice, CarType type) {
        Car car1 = new Car(manufacturer, make, model, basePrice, type);
        carList.add(car1);
    }

    //display cars with same manufacturer values as in parameter.
    public void showCars(String manufacturer) {
        boolean foundCar = false;

        for (Car car : carList) {
            if(car.getManufacturer().equals(manufacturer)) {
                System.out.println(car + "\n");
                foundCar = true;
            }
        }

        if(!foundCar) {
            System.out.println("Sorry no cars found" + "\n");
        }
    }

    //display cars with same manufacturer and make values as in parameter.
    public void showCars(String manufacturer, int make) {
        boolean foundCar = false;

        for (Car car : carList) {
            if(car.getManufacturer().equals(manufacturer) && car.getMake() == make) {
                System.out.println(car + "\n");
                foundCar = true;
            }
        }

        if(!foundCar) {
            System.out.println("Sorry no cars found" + "\n");
        }
    }

    //display cars which have the same manufacture, make and a price no more than values as in parameter
    public void showCars(String manufacturer, int make, double basePrice) {
        boolean foundCar = false;

        for (Car car : carList) {
            if(car.getManufacturer().equals(manufacturer) && car.getMake() == make && car.getBasePrice() <= basePrice) {
                System.out.println(car + "\n");
                foundCar = true;
            }
        }

        if(!foundCar) {
            System.out.println("Sorry no cars found" + "\n");
        }
    }

    //getters
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return  "id: " + id + ", Name: " + name + ", address: " + address;
    }
}
