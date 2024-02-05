package newCarSystem;

public class ParkingSpace {
    private final int capacity;
    private int usedParkingSlots;
    private Car[][][] parkingSpace;

    // 初始化ParkingSpace
    public ParkingSpace() {
        this.capacity = 500; // 停车场容量
        this.usedParkingSlots = 0; // 已使用停车位
        parkingSpace = new Car[5][5][20]; // 停车位数组
    }

    // 存车方法，返回存车位置信息
    public String saveCar(Car enterCar, int floor, int area, int location) {
        // 实现存车逻辑
        return "The save location of car.";
    }

    // 取车方法，根据车牌号执行操作
    public boolean leaveCar(Car yourCar) {
        // 实现取车逻辑
        return true;
    }

    // 查找车位方法，返回车辆位置信息
    public String findCar(String carNumber) {
        // 实现查找车位逻辑
        return "The location of car.";
    }
}
