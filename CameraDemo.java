class Camera {
    private String brand;
    private double cost;

    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

class DigitalCamera extends Camera {
    private int memory;

    public DigitalCamera(String brand, double cost, int memory) {
        super(brand, cost);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

public class CameraDemo {
    public static void main(String[] args) {
        DigitalCamera digitalCamera = new DigitalCamera("Nikon", 100, 16);

        String brand = digitalCamera.getBrand();
        double cost = digitalCamera.getCost();
        int memory = digitalCamera.getMemory();

        System.out.println(brand + ", " + cost + "$, " + memory + "GB");
    }
}
//15
