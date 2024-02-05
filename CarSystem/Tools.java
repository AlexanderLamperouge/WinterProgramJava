package CarSystem;

import java.time.*;
import java.util.*;

public class Tools {

    // This method can get the time of car enter
    // 获得进入时间
    public static int getTime() {
        int enterTime = LocalTime.now().getHour() * 100 + LocalTime.now().getMinute();
        return enterTime;
    }

    // 计算价格
    public int countPrice(int enterTime) {
        int yourPrice = 0;
        return yourPrice;
    }

    // 获得帮助信息
    public static void getHelp() {
        System.out.println("Help list.");
    }

    // 解析车位信息
    public static Location getLocation() {
        String Floor;
        String Area;
        int Number;

        Location myLocation = new Location(Floor, Area, Number);

        return myLocation;
    }
}
