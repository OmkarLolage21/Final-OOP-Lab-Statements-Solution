import java.util.Scanner;

interface Vehicle {
    void move();
}

class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("Helicopter flies in the air.");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car drives on the road.");
    }
}

class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train runs on the track.");
    }
}

public class VehicleFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of vehicle do you want to order? (Helicopter/Car/Train)");
        String vehicleType = scanner.nextLine().trim().toLowerCase();

        Vehicle vehicle;
        switch (vehicleType) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid input! Please enter either Helicopter, Car, or Train.");
                scanner.close();
                return;
        }

        vehicle.move();
        scanner.close();
    }
}
//17
