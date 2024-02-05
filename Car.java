package newCarSystem;

public class Car {
    private String CarNumber;
    private int enterTime;
    private Location carSpace;

    public Car(String licensePlate, int enterTime, Location enterSpace) {
        this.CarNumber = licensePlate;
        this.enterTime = enterTime;
        this.carSpace = enterSpace;
    }

    // Getter 方法，用于访问车辆信息
}
