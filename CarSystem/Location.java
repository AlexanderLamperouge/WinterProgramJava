package CarSystem;

public class Location {
    private String Floor;
    private String Area;
    private int Number;

    // 初始化车辆位置信息
    public Location(String enterFloor, String enterArea, int enterNumber) {
        this.Floor = enterFloor;
        this.Area = enterArea;
        this.Number = enterNumber;
    }

    // 获得车辆位置信息
    public void getLocation() {
        System.out.println("The car's location is: xyz.");
    }
}
