package CarSystem;

public class ParkingSpace {
    private final int capacity;
    private int usedParkingSlots;
    private Car[][][] parkingSpace;

    // 初始化ParkingSpace
    public ParkingSpace() {
        this.capacity = 500;
        this.usedParkingSlots = 0;
        parkingSpace = new Car[5][5][20];
    }

    // 返回存的车位，并使已使用车位数量+1
    public void saveCar(Car enterCar) {
        if (usedParkingSlots < capacity) {

        }

    }

    // 返回取出车位是否成功，并使已使用车位数量-1
    public boolean leaveCar(String carNumber) {
        // if success
        return true;
        // else
        // return false;
    }

    // 返回找寻的车辆位置
    public String findCar(String carNumber) {
        return "The location of car.";
    }
}
