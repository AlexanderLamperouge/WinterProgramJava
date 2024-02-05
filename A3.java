package newCarSystem;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();

        while (true) {
            // 显示用户菜单
            System.out.println("Options:");
            System.out.println("1. Save car");
            System.out.println("2. Leave car");
            System.out.println("3. Print price and time");
            System.out.println("4. Find car");
            System.out.println("5. Help");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // 实现存车逻辑
                    break;
                case 2:
                    // 实现取车逻辑
                    break;
                case 3:
                    // 打印价格和停车时间
                    break;
                case 4:
                    // 查找车辆位置
                    break;
                case 5:
                    // 提供帮助信息
                    Tools.getHelp();
                    break;
                case 6:
                    // 退出程序
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (choice == 6) {
                break;
            }
        }
        sc.close();
    }
}
