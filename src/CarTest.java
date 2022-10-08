//Nandagopan Dilip
//301166925

public class CarTest {
    public static void main(String[] args) {
        //creating dealership objects
        Dealership dealership1 = new Dealership("D22_100", "The Five Dealership", "1029 Main Street, Toronto" );
        Dealership dealership2 = new Dealership("D22_101", "The Six Dealership", "1030 Main Street, Toronto" );
        Dealership dealership3 = new Dealership("D22_102", "The Seven Dealership", "1031 Main Street, Toronto" );

        //creating car objects in dealership objects
        dealership1.addCar("Honda", 2022, "Civic", 26000, CarType.Sedan);
        dealership1.addCar("Hyundai", 2019, "Elantra", 20000, CarType.Sedan);
        dealership1.addCar("Mazda", 2022, "CX-5", 30000, CarType.SUV);
        dealership1.addCar("Mazda", 2022, "BT-50", 33000, CarType.Truck);

        dealership2.addCar("Honda", 2020, "Civic", 19000, CarType.Sedan);
        dealership2.addCar("Volkswagen", 2019, "Golf", 30000, CarType.HatchBack);
        dealership2.addCar("Ram", 2018, "1500", 23000, CarType.Truck);
        dealership2.addCar("Ford", 2022, "F-150", 29000, CarType.Truck);

        dealership3.addCar("Audi", 2021, "A7", 79000, CarType.HatchBack);
        dealership3.addCar("Jaguar", 2022, "XF", 64000, CarType.Sedan);
        dealership3.addCar("Lamborghini", 2021, "Estoque", 260000, CarType.Sedan);
        dealership3.addCar("Bugatti", 2020, "Veyron", 2700000, CarType.HatchBack);
        dealership3.addCar("Porsche", 2022, "Cayenne", 82000, CarType.SUV);

        showDealerShipDetails(dealership1);
    }

    public static void showDealerShipDetails(Dealership dealership1) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Results for cars from Honda:");
        dealership1.showCars("Honda");
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Results for 2022 cars from Mazda:");
        dealership1.showCars("Mazda", 2022);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Results for 2022 cars from Mazda, with price no more than 30000:");
        dealership1.showCars("Mazda", 2022, 30000);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Results for 2021 cars from Ford, with price no more than 30000:");
        dealership1.showCars("Ford", 2021, 30000);
        System.out.println("-----------------------------------------------------------------------------------------\n");
    }
}
