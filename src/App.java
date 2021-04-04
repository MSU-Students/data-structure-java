import java.util.Scanner;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to MSU CAR Checkpoint");
        CarRegistry msuCarRegistry = new CarRegistry();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String plate = scanner.next();
            String owner = scanner.next();
            String model = scanner.next();
            String year = scanner.next();

            // System.out.println("Looking for " + plate + "....");
            
            Car smallCar = new Car();
            smallCar.setPlateNumber(plate);
            smallCar.setModel(model);
            smallCar.setYearModel(year);
            smallCar.setOwner(owner);
            msuCarRegistry.register(smallCar);
        }
        scanner.close();
        Car []list = msuCarRegistry.getList();
        for (int i = 0; i < list.length; i++) {
            Car theCar = list[i];
            System.out.println(theCar.getPlateNumber() + " " + theCar.getOwner());
        }
    }
}
